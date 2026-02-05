class Calc{
    static int add(int x,int y){
        return(x+y);
    }
    static int mul(int x,int y){
        return(x*y);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        int r1 = Calc.add(10,20);
        System.out.println(r1);
        int r2 = Calc.mul(2, 3);
        System.out.println(r2);
    }
    
}
