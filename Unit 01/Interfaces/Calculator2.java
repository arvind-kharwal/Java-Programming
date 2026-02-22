interface Addition{
    int sum(int a,int b);
}
interface Subtraction{
    int sub(int a,int b);
}
class GetCal implements Addition,Subtraction{
    public int sum(int a,int b){
        return(a+b);
    }
    public int sub(int a,int b){
        return(a-b);
    }
}
public class Calculator2 {
    public static void main(String[] args) {
        GetCal G1 = new GetCal();
        int r1 = G1.sum(10,20);
        System.out.println(r1);
        GetCal G2 = new GetCal();
        int r2 = G2.sub(30,10);
        System.out.println(r2);

    }
}
