import java.util.*;
class SortMethod {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Java");
    names.add("Hello");
    names.add("ABC");
    names.add("Programming");
    System.out.println("Before sorting, names : " + names);
    Collections.sort(names);
    System.out.println("After sorting, names : " + names);
    }
}