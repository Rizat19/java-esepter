package OOP1;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;


    public MyCircle(){
        center = new MyPoint();
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x,y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }

    // Returns the distance of the center for this MyCircle and another MyCircle
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
