package pack1;
class One{
    void display(){
        System.out.println("Display in Class One");
    }
}

public class First {
    public static void main(String[] args) {
        One A = new One();
        A.display();
    }
}
