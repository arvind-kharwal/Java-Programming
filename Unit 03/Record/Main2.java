record Student1(int r,String name){
    Student1(){
        this(0, null);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Student1 S1 = new Student1(1, "Arvind");
        System.out.println(S1);
        System.out.println(S1.name());
        System.out.println(S1.r());
        Student1 S2 = new Student1();
        System.out.println(S2);

    }
}
