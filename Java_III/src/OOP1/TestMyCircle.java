package OOP1;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(new MyPoint(4,2),5);
        MyCircle c2 = new MyCircle(new MyPoint(3,4),2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.distance(c2));
    }
}
