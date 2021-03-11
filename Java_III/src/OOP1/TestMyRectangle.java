package OOP1;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1= new MyPoint();
        MyPoint p2= new MyPoint(7,8);

        MyRectangle r = new MyRectangle(p1,p2);
        System.out.println(r);
    }
}
