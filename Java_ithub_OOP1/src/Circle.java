public class Circle {
    //1.1 Пример: Класс Circle, 1.2 Упражнение: Создать согласно диаграмме класс Circle
    private double radius;
    private String color;

    public Circle() {
        this.radius = 16.0;
        this.color = "yellow";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "black";
    }

    public Circle(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
