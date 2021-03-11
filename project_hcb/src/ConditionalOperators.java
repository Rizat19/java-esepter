import java.util.Scanner;
public class ConditionalOperators {
    public static void main(String[] args) {
        //Включить кондиционер, если температура больше 25 градуса

//        int temp=26;
//        if (temp>25){
//            System.out.println("Кондиционер включен");
//        }else  if (temp<22){
//            System.out.println("Кондиционер выключен");
//        }else {
//            System.out.println("Кондиционер ничего не делает");
//        }

        /*Написать программу, которая советует вам, что купить в зависимости от количества денег в вашем кармане.
        Например: - если у вас больше 500 рублей, то выводит “Пицца”
        - если у вас от 300 до 500 рублей, то “Шаурма”
        - если от 100 до 300 рублей, тогда “Гамбургер”
        - если меньше 100 рублей, то “Доширак”*/
        Scanner input=new Scanner(System.in);
        System.out.print("Сколько деньги у тебя есть:");
        int money=input.nextInt();
        if (money>500){
            System.out.println("Пицца");
        }else if (money<100){
            System.out.println("Доширак");
        }else if (money>100 && money<300){
            System.out.println("Гамбургер");
        }
        else{
            System.out.println("Шаурма");
        }


    }
}
