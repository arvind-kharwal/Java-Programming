interface Sample{
    void display();
}
public class Main implements Sample{
    public void display(){
        System.out.println("Display Method");
    }
    public static void main(String[] args) {
        Main M = new Main();
        M.display();
    }
}
