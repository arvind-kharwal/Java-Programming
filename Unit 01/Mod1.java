public class Mod1 {
    public static void main(String[] args) {
        int a = 5;
        int b;
        // b = a++ + ++a;
        b = ++a + a++;
        System.out.println("a: "+a+"\nb: "+b);
    }
}
