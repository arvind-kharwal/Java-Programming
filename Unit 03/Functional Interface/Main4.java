interface Sample4{
    void display(int n);
}
public class Main4 {
    public static void main(String[] args) {
        Sample4 S = (int n)->{
            n = n+20;
            System.out.println(n);
        };
        S.display(5);
    }
}
