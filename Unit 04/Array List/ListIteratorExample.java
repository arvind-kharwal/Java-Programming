import java.util.*;
class ListIteratorExample {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    System.out.println("num : " + num);
    ListIterator<Integer> iterator = num.listIterator();
    System.out.println("Iterating over an ArrayList:");
    // returns true if there is next element in the ArrayList
    while (iterator.hasNext()) {
      // Printing the iterated value
    System.out.print(iterator.next() + " ");
    }
    }
}