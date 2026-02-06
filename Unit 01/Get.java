class Demo{
    int r;
    String Name;
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
}

public class Get {
    public static void main(String[] args) {
        Demo D = new Demo();
        D.setR(10);
        int r1 = D.getR();
        System.out.println(r1);
    }
    
}
