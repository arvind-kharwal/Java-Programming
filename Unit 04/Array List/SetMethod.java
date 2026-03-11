import java.util.*;
class SetMethod {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(15);
    num.add(9);
    num.add(20);
    num.add(35);
    System.out.println("ArrayList num : " + num);
    num.set(0, 40);
    System.out.println("ArrayList num after updating : " + num);
    }
}