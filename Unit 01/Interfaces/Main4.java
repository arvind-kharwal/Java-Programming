interface Addition{
    int add(int a,int b );
}
interface Subtraction{
    int sub(int a,int b);
}
class Calculator implements Addition,Subtraction{
    public int add(int a,int b){
        return(a+b);
    }
    public int sub(int a,int b){
        return(a-b);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Calculator C = new Calculator();
        int res1 = C.add(10, 20);
        System.out.println("Addition: "+res1);
        int res2 = C.sub(30,40);
        System.out.println("The subtraction "+res2);
    }
}
