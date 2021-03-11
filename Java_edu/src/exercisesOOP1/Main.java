package exercisesOOP1;

public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2=new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3=new Circle(3.0,"grey");
        System.out.println("The circle have radius of " + c3.getRadius() + ", color of "+c3.getColor()+" and area of " + c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(5.5); // изменить радиус
        System.out.println("radius is: " + c4.getRadius()); // Распечатать радиус через геттер
        c4.setColor("green"); // Изменить цвет
        System.out.println("color is: " + c4.getColor()); // Распечатать цвет через геттер

        Circle c5=new Circle(5.3);
        System.out.println(c5);

    }
}
