package pack1;
interface Test1{
    static void display(){
        System.out.println("display in Test1");
    }
}
interface Test2 extends Test1{
    static void display(){
        System.out.println("display in Test2");
    }
}

interface Test3 extends Test1{
    static void display(){
        System.out.println("display in Test3");
    }
}

class DTest implements Test2,Test3{
    static void display(){
        Test2.display();
        Test3.display();
        System.out.println("display in Dtest");
    }
}
public class DiamondStatic {
    public static void main(String[] args) {
        DTest.display();
    }
}
