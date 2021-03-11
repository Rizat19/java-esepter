public class CircleObject implements GeometricObject {

    protected double radius;

    public CircleObject(double radius) {
        this.radius = radius;
    }

    public CircleObject() {
        radius = 1.0;
    }

    @Override
    public String toString() {
        return "CircleObject{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


}
