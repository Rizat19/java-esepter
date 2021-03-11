public class Main {
    public static void main(String[] args) {
        ExampleOOP Adam=new ExampleOOP();
        ExampleOOP Jake=new ExampleOOP();
        ExampleOOP Jennie=new ExampleOOP();
        ExampleOOP Alex=new ExampleOOP();
        ExampleOOP Selena=new ExampleOOP();

        Adam.age=15;
        Jake.age=26;
        Jennie.age=20;
        Alex.age=69;
        Selena.age=7;

        Adam.weight=52.3;
        Jake.weight=78.6;
        Jennie.weight=50;
        Alex.weight=96.1;
        Selena.weight=25;

        System.out.println("Adam :"+Adam.age+","+Adam.weight+"kg"+",\nJake :"+Jake.age+","+Jake.weight+"kg");
        double averageAge= (Adam.age+ Jake.age+ Jennie.age+ Alex.age+ Selena.age)/5;
        System.out.println("They average age is: "+averageAge);


    }
}
