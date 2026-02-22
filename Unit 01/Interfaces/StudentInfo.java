interface S1{
    int r = 1;
    String name ="Arvind";
}
interface S2 extends S1{
    void display();
}
public class StudentInfo implements S2 {
    public void display(){
        System.out.println(r+" "+name);
    }
    public static void main(String[] args) {
        StudentInfo S1 = new StudentInfo();
        S1.display();
    }
}
