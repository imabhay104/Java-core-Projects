import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> list = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == CAPACITY) {
            System.out.println("Buffer full, producer waiting...");
            wait(); // Wait until space is available
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer thread
    }

    public synchronized int consume() throws InterruptedException {
        while (list.isEmpty()) {
            System.out.println("Buffer empty, consumer waiting...");
            wait(); // Wait until items are available
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer thread
        return value;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(500); // Simulate production time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(1000); // Simulate consumption time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
