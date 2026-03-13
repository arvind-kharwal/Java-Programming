import java.util.*;
class IteratingUsingLoops {
    public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("orange");
    colors.add("blue");
    colors.add("pink");
    for (int i = 0; i < colors.size(); i++) {
        System.out.print(colors.get(i) + " ");
    }
    System.out.println();
    for (String color : colors) 
        System.out.print(color + " ");
    }
}