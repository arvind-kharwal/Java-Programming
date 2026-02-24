class Example2 implements Runnable{
    public void run(){
        System.out.println("run() in Example2");
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Example2 E2 = new Example2();
        Thread T1 = new Thread(E2);
        T1.start();
    }
}
