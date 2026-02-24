class Example extends Thread{
    public void run(){
        System.out.println("Run Method in Example");
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Example E1 = new Example();
        E1.start();
    }
}
