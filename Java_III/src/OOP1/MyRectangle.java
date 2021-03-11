package OOP1;

public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;

    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
