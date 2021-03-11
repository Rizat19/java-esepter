public class SquareShape extends RectangleShape{

    public SquareShape() {
        super();
    }

    public SquareShape(double side) {
        super(side, side);
    }

    public SquareShape(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.width;
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public void setWidth(double width) {
        this.setSide(width);

    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getArea() {
        return super.width * super.width;
    }

    @Override
    public double getPerimeter() {
        return super.width * 4;
    }
}