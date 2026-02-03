class Rectangle {
    int length,width;

    Rectangle(int x,int y){
        length = x;
        width = y;
    }
    int calarea(){
        int r = length*width;
        return(r);
    }
    
}
public class Main{
    public static void main(String[] args) {
        Rectangle R = new Rectangle(5, 5);
        int res = R.calarea();
        System.out.println("The area is "+res);
    }
}
