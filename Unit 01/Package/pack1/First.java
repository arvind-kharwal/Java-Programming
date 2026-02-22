package pack1;
class One{
    public void display(){
        System.out.println("Display in Class One");
    }
}

public class First extends One {
    public static void main(String[] args) {
        One A = new One();
        A.display();
    }
}
