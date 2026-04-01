public class Main1 {
    public static void main(String[] args) {
        Integer I1 = 10;
        System.out.println(I1);
        Main1 M = new Main1();
        boolean r = I1 instanceof Integer;
        System.out.println(r);
        System.out.println(M.getClass());
    }
}
