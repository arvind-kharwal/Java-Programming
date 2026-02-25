public class Main{
    static void display() throws Exception{
        System.out.println("I am in display");
    }
    public static void main(String[] args) {
        try{
            display();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
