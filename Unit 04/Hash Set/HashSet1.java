import java.util.*;
public class HashSet1{
    public static void main(String args[]){
    HashSet<String> str= new HashSet<String>();
    System.out.println("Size at the beginning "+str.size());
    str.add("Hello");
    str.add("Hi");
    str.add("Namaste");
    str.add("Bonjour");
    System.out.println(str);
    System.out.println("Size after addition "+str.size());
    str.remove("Bonjour");
    System.out.println(str);
    System.out.println("Size after removal "+str.size());
    }
}