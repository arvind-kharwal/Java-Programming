import java.util.*;
class GetMethod{
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("C");
    names.add("C++");
    names.add("Python");
    names.add("Java");
    System.out.println("Elements in ArrayList names : " + names);
    System.out.println("Element at index 2 : " + names.get(2));
    }
}