import static java.lang.Math.PI;
interface AreaCircle{
    double area(int r);
}
public class CalArea {
    public static void main(String[] args) {
        AreaCircle A1 = (int r)-> PI*r*r;
        double r = A1.area(3);
        System.out.println(r);

    }
}
