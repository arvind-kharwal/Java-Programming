record Student(int r,String name){}
public class Main1 {
    public static void main(String[] args) {
        Student S1 = new Student(1, "Arvind");
        System.out.println(S1);
        System.out.println(S1.name());
        System.out.println(S1.r());
    }
}
