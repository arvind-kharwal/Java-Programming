class Example{
    final static int age;
    static{
        age = 10;
    }
}
public class Main1 {
    public static void main(String[] args) {
        System.out.println(Example.age);
        // int b = (Example.age)++;
    }
}
