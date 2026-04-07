class Example{
    private int a;
    private int b;
    Example(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    // @Override
    // public String toString() {
    //     return "Example [a=" + a + ", b=" + b + "]";
    // }
    
    
}
public class Main {
    public static void main(String[] args) {
        Example E1 = new Example(10, 20);
        System.out.println(E1.getA());
        System.out.println(E1.getB());
        System.out.println(E1.getClass());
    }
}
