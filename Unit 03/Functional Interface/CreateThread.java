class Example3 implements Runnable{
    public void run(){
        System.out.println("Thread 1");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        Example3 E1 = new Example3();
        Thread T1 = new Thread(E1);
        Runnable R = ()->System.out.println("Thread 2");
        Thread T2 = new Thread(R);
        T1.start();
        T2.start();
    }
    
}
