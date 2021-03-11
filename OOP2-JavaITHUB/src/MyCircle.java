public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle() {
        radius = 1;
        center = new MyPoint(0, 0);
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {return center;}

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {return radius; }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        center.setX(x);
    }

    public void setY(int y) {
        center.setY(y);
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY(); // cannot use center.x and x is private in MyPoint
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public int [] getCenterXY() {
        int [] xy = {center.getX(), center.getY()};
        return xy;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}