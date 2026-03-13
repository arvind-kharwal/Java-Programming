import java.util.*;
class RemoveMethod {
    public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("orange");
    colors.add("blue");
    colors.add("pink");
    colors.add("black");
    colors.add("green");
    System.out.println("ArrayList colors : " + colors);
    colors.remove("pink");
    System.out.println("ArrayList colors : " + colors);
    colors.remove(2);
    System.out.println("ArrayList colors : " + colors);
    }
}