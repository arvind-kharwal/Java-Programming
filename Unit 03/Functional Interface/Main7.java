class Example implements Runnable{
    public void run(){
        System.out.println("This is thread 1");
    }
}
public class Main7 {
    public static void main(String[] args) {
        Example E = new Example();
        Thread T1 = new Thread(E);
        Runnable R = ()->System.out.println("Thread 2");
        Thread T2 = new Thread(R);
        T1.start();
        T2.start();

    }
}
