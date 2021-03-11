import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("***********************Application started**********************\n\nAuthor: Оразалина Ризат");
        line();
        while(true){
            System.out.print("\nПродолжить работу? 'yes'-продолжить, 'no'-выйти: ");
            String choiceUser=input.next();
            String yes="yes";
            String no="no";
            if (yes.equals(choiceUser)){
                System.out.println("Введите первое число:");
                int firstNumber= input.nextInt();
                System.out.println("Введите второе число:");
                int secondNumber= input.nextInt();
                System.out.println("Введите операцию:");
                char operation=input.next().charAt(0);
                int result=calc(firstNumber,secondNumber,operation);
                System.out.println("Результат операции: "+firstNumber+operation+secondNumber+"="+result);
                line();
            }else if(no.equals(choiceUser)){
                System.out.println("\n***********************Application end**********************");
                break;
            }else{
                System.out.println("Произошла ошибка, введите правильно!!!");
            }
        }

    }
    public static void line(){
        for(int i=0;i<=50;i++){
            System.out.print("*");
        }
    }
    public static int calc(int num1,int num2,char operation){
        int result=0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '*' -> result = num1 * num2;
            default -> System.out.println("Операция не распознана. Повторите ввод.");
        }
        return result;
    }
}
