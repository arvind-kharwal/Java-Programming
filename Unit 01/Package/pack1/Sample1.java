package pack1;
class AA{
    public static int r = 2;
    public static String name = "Arvind";
    public static void display(){
        System.out.println(r+" "+name);
    }
}

public class Sample1 extends AA {
    public static void main(String[] args) {
        AA.display();
    }
    
}
