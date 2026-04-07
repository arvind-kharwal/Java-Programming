record Student1(int r,String name){}
public class Main2 {
    public static void main(String[] args) {
        Student1 S1 = new Student1(1, "Arvind");
        System.out.println(S1);
        System.out.println(S1.name());
        System.out.println(S1.r());
    }
}
