import java.util.*;
class IsEmptyMethod {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    System.out.println("ArrayList num : " + num);
    System.out.println("ArrayList is empty : " + num.isEmpty());
    num.clear();
    System.out.println("ArrayList is empty : " + num.isEmpty());
    }
}