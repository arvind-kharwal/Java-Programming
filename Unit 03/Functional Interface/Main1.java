interface Sample1{
    String display(String name);
}
public class Main1 {
    public String display(String name){
        return "Hello "+name;
    }
    public static void main(String[] args) {
        Main1 M = new Main1();
        String res = M.display("Arvind");
        System.out.println(res);
    }
}
