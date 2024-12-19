class Test extends Thread {
    Test() {
        System.out.println("Inside Test Constructor: " + Thread.currentThread());
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Test Thread: " + i);
            System.out.println("Running in: " + Thread.currentThread());

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Thread123 {
    public static void main(String[] args) {
        System.out.println("Main Thread Starting: " + Thread.currentThread());
Runnable runnable=() -> {
    for (int i = 0; i <4 ; i++) {
        System.out.println("fuck off");
        System.out.println("Runnable Thread Starting: " + Thread.currentThread());


    }

};
        Test t = new Test(); // Create the Test thread
        t.start(); // Start the Test thread
        Thread test45 = new Thread(runnable);
        test45.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(800); // Pause for 0.8 seconds
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Main Thread Ending.");
    }
}
