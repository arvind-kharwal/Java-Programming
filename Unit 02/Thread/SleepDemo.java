class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: iteration " + i);
            try {
                // Sleep for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}