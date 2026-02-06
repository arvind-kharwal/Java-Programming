class Demo1{
    private int x;
    private String name;
    void getdata(int x,String name){
        this.x = x;
        this.name = name;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(name);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Demo1 D = new Demo1();
        D.getdata(10,"Arvind");
        D.display();
    }    
}
