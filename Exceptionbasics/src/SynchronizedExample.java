import java.util.*;

public class SynchronizedExample {
    public static void main(String[] args) {
        // Creating a synchronized list
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

        // Adding elements to the list in multiple threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                syncList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                syncList.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the synchronized list
        synchronized (syncList) {  // Synchronize when iterating as well
            for (Integer number : syncList) {
                System.out.println(number);
            }
        }
    }
}
