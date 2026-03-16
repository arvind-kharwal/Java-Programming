class Shape{
    double area(){
        System.out.println("Area Method of Shape class");
        return(0);
    }
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    double area(){
        double a = 3.14*r*r;
        return(a);
    }
}

class Triangle extends Shape{
    double base,height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        double a = 0.5*base*height;
        return(a);
    }
}
class Rectangle extends Shape{
    double l,h;
    Rectangle(double l,double h){
        this.l = l;
        this.h = h;
    }
    double area(){
        double a = l*h;
        return(a);
    }
}
public class Overriding {
    public static void main(String[] args) {
        Circle C1 = new Circle(2);
        double r1 = C1.area();
        System.out.println("The area of circle is: "+r1);
        Triangle T1 = new Triangle(2, 8);
        double r2 = T1.area();
        System.out.println("The area of Triangle is: "+r2);
        Rectangle R1 = new Rectangle(4, 8);
        double r3 = R1.area();
        System.out.println("The area of Rectangle is: "+r3);
    }
}
