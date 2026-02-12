interface Interface1 {
    final int a = 10;           // public, static and final
    void display();             // public and abstract
}
class TestClass implements Interface1 {
    public void display(){ 
        System.out.println("Hello"); 
    }
}
class Main{
    public static void main(String[] args){
        TestClass t = new TestClass();
        t.display();
        System.out.println(TestClass.a);
        System.out.println(Interface1.a);
    }
}