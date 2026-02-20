class Animal{
    String name;
    Animal(String name){
        this.name =name;
    }
    void display(){
        System.out.println(name);
    }
}
class Dog extends Animal{
    int age;
    Dog(String name,int age){
        super(name);
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Dog D = new Dog("Doggy", 3);
        D.show();
    }
}
