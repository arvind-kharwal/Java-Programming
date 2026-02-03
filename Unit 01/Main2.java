class Rectangle {
    int length,width;
    Rectangle(){
        length = 0;
        width = 0;
    }
    Rectangle(int x,int y){
        length = x;
        width = y;
    }
    int calarea(){
        int r = length*width;
        return(r);
    }
}
public class Main2{
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(10,20);
        int res1 = R1.calarea();
        System.out.println(res1);
        int res2 = R2.calarea();
        System.out.println(res2);
    
    }
}
