package OOP1;

public class Rectangle1 extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle1(){}

    public Rectangle1(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimetr(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle1{" +super.toString()+","+
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
