import java.util.Scanner;  
public class Exersices {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Введите катет а:");
//        double a= input.nextDouble();
//        System.out.println("Введите катет b:");
//        double b= input.nextDouble();
//        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        System.out.println("Гипотенуза с равно: "+c);

        //2задача
//        System.out.print("Сколько сейчас время: ");
//        int time= input.nextInt();
//        boolean isGoodWeather=true;
//        boolean late=time >=23 || time<=5;
//        if (late){
//            System.out.println("Спать");
//        }
//        if(!late && isGoodWeather){
//            System.out.println("Идем гулять");
//        }
//        if(!late && !isGoodWeather){
//            System.out.println("Читать книгу");
//        }

        //Вывести все нечетные числа от 100 до 1000, которые делятся без остатка на 5.
        for (int i=100;i<=1000;i++){
            if (i%2!=0 && i%5==0) {
                System.out.println(i);
            }
        }
    }
}
