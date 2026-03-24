interface Sample8{
    String display(String name);
}
public class Main8 {
    public static void main(String[] args) {
        String str = "Hello";
        Sample8 S = (String name)->{
            return str+" "+name;
        };
        String res = S.display("Arvind");
        System.out.println(res);
    }
}
