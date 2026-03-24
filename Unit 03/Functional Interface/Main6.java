interface Sample6{
    int square(int n);
    default int add(int a,int b){
        return a+b;
    }
    static int divide(int a,int b){
        return a/b;
    }
}
public class Main6 implements Sample6{
    public int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        Main6 M1 = new Main6();
        int r1 = M1.add(10,20);
        System.out.println(r1);
        int r2 = Sample6.divide(6,3);
        System.out.println(r2);
        int r3 = M1.square(4);
        System.out.println(r3);
    }
}
