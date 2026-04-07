abstract sealed class Shape permits Circle,Rectangle{
    abstract void area();
}
final class Circle extends Shape{
    private int r;
    Circle(int r){
        this.r = r;
    }
    void area(){
        double res = Math.PI*r*r;
        System.out.println(res);
    }
}

final class Rectangle extends Shape{
    private int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        double res = l*b;
        System.out.println(res);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Circle C1 = new Circle(2);
        C1.area();

    }
}
