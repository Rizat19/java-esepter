public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        //1 & 2 exercise
        Circle c3 = new Circle(8.0, "pink");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color of " + c3.getColor());


        //3 exercise

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c1.getColor());

        System.out.println();

        Circle c5 = new Circle();
        System.out.println(c5.toString());

        Circle c6 = new Circle(7.8);
        System.out.println (c6.toString());
        System.out.println (c6);

        System.out.println(c6.getCircumference());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());

        Rectangle rectangle1 = new Rectangle(12,5);
        System.out.println(rectangle1.getArea() + " " + rectangle1.getPerimeter());

        Employee e = new Employee();
        e.setSalary(150000);
        System.out.println(e.raiseSalary(3));

    }
}
