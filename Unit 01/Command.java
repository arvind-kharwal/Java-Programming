public class Command {
    public static void main(String[] args) {
        int count;
        String s;
        count = args.length;
        System.out.println("The number of arguments are: "+count);
        for(int i = 0;i<count;i++){
            s = args[i];
            System.out.println(""+s);
        }
    }
}
