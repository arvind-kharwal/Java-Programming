interface A {
    void method1();
    void method2();    
}
interface B extends A{
    void method3();
}

class Sample implements B{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
    public void method3(){
        System.out.println("Method 3");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Sample S = new Sample();
        S.method1();
        S.method2();
        S.method3();
    }
}
