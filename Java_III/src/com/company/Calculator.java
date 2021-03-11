package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("***********************Application started**********************\n\nAuthor: Оразалина Ризат");
        line();
        while(true){
            try{
                System.out.print("\nПродолжить работу? 'yes'-продолжить, 'no'-выйти: ");
                String choiceUser=input.next();
                String yes="yes";
                String no="no";
                if (yes.equals(choiceUser)){
                    System.out.println("Введите первое число:");
                    int firstNumber= input.nextInt();
                    System.out.println("Введите второе число:");
                    int secondNumber= input.nextInt();
                    System.out.println("Введите операцию +,*,-,/ :");
                    char operation=input.next().charAt(0);
                    if (operation=='/' && secondNumber==0){
                        throw new DivisionException();
                    }
                    double result=calc(firstNumber,secondNumber,operation);
                    System.out.println("Результат операции: " + result);
                    line();
                }else if (no.equals(choiceUser)){
                    System.out.println("\n***********************Application end**********************");
                    break;
                }else{throw new InputMismatchException();}
            }catch(DivisionException  e){
                System.out.println(e.getMessage());
                line();
            }catch(InputMismatchException e1){
                System.out.println("Ошибка ввода!!!");
                input.next();
                line();
            }

        }

    }


    public static void line(){
        for (int i=0;i<=50;i++){
            System.out.print("_");
        }
        System.out.println();
    }

    public static double calc(int num1,int num2,char operation){
        double result=0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = (double) num1 / num2;
            case '*' -> result = num1 * num2;
            default -> System.out.println("Операция не распознана. ");
        }
        return result;
    }
}

class DivisionException extends Exception{
    public DivisionException(){
        super("Ошибка: нельзя делить на ноль!!!");
        }
}

