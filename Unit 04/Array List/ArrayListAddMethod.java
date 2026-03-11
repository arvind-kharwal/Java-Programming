import java.util.*;
class ArrayListAddMethod {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    System.out.println("Elements in ArrayList arr " + arr);
    arr.add(2, 5);
    arr.add(3, 6);
    System.out.println("ArrayList arr after adding new elements " + arr);
    }
}