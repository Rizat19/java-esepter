package exercisesOOP1;

public class Circle {

    private double radius;
    private String color;

    public Circle(){
        radius=1.0;
        color="red";
    }

    public Circle(double r){
        radius=r;
        color="red";
    }

    public Circle(double r, String c){
        radius=r;
        color=c;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public String toString(){
        return "Circle[radius=" + radius + " color=" + color+"]";
    }
}
