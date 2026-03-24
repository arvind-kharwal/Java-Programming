interface Sample5{
    int sum(int a,int b);
}
public class Main5 {
    public static void main(String[] args) {
        Sample5 S = (int a,int b)->a+b;
        int res = S.sum(10,20);
        System.out.println(res);
    }
}
