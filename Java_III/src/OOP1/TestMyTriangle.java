package OOP1;

public class TestMyTriangle {
    public static void main(String[] args) {

        MyTriangle v = new MyTriangle(new MyPoint(3,9),new MyPoint(7,4),new MyPoint(3,4));
        MyTriangle v2 = new MyTriangle(2,3,2,3,2,3);
        System.out.println(v);
        System.out.println(v2);

        System.out.println(v.getType());
        System.out.println(v2.getType());

        System.out.println(v.getPerimetr());
    }
}
