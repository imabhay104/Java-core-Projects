import java.util.*;

public class SynchronizedCollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            synchronized (list) { // Explicit synchronization for iteration
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                    System.out.println("Added: " + i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (list) { // Explicit synchronization for iteration
                for (Integer i : list) {
                    System.out.println("Read: " + i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
