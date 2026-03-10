import java.util.*; 
public class Vector1{
    public static void main(String args[]){
        Vector<Integer> v= new Vector<Integer>();   
        System.out.println("Size at the beginning "+v.size());
        v.add(19);
        v.add(88);
        v.add(1);
        v.add(39);
        System.out.println(v);
    System.out.println("Size after addition "+v.size());
    v.remove(3);
    System.out.println(v);
    System.out.println("Size after removal "+v.size());
    }
    }
