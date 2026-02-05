class Student{
    int r;
    String name;
    Student(int r,String name){
        this.r  = r;
        this.name = name;
    }
    Student(Student S){
        this.r = S.r;
        this.name = S.name;
    }
    void display(){
        System.out.println("Roll Number: "+r);
        System.out.println("Name: "+name);
    }
}

public class Copy {
    public static void main(String[] args) {
        Student St1 = new Student(1,"Arvind");
        System.out.println("Displaying original Object");
        St1.display();
        Student St2 = new Student(St1);
        System.out.println("Displaying Copied Object");
        St2.display();
    }
    

}
