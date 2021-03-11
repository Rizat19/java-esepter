package OOP1;

public class Circle1 extends Shape{
    private double radius = 1.0;

    public Circle1(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimetr(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +super.toString()+","+
                "radius=" + radius +
                '}';
    }
}
