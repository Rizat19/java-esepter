public class RectangleShape extends Shape {

    protected double width;
    protected double length;

    public RectangleShape() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public RectangleShape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RectangleShape(String color, boolean filled, double width, double length) {
        super(color, filled);
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

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}