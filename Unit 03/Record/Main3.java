import java.util.Scanner;

record Person(int r,String name){
    public Person{
        if(r==0)
            throw new IllegalArgumentException();
    }
}
public class Main3 {
    public static void main(String[] args) {
    try( Scanner S = new Scanner(System.in)){
        System.out.println("Enter r:");
        int r1 = S.nextInt();
        System.out.println("Enter name: ");
        String name = S.nextLine();
        Person P1 = new Person(r1, name);
        System.out.println(P1);
    }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
        
    }
}
