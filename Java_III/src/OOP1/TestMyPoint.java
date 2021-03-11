package OOP1;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        System.out.println(p1);
        System.out.println(p1.distance(12,7));

        MyPoint p2 = new MyPoint(5,6);
        System.out.println(p1.distance(p2));

        p2.setXY(7,8);
        System.out.println(p2.getXY()[0]);

        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++){
            points[i] = new MyPoint(i,i);
        }

        //
        System.out.println(Arrays.toString(points));
    }
}
