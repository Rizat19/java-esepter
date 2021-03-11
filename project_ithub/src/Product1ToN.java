public class Product1ToN {
    public static void main(String[] args) {
        //Напишите программу, Product1ToN вызывающую вычисление произведения целых чисел от 1 до 10 (т. Е. 1×2×3×...×10) Как int. Обратите внимание, что это то же самое, что и факториал N.
        int product = 1; // Накопленный продукт, инициализация 1
        int lowerbound = 1;
        int upperbound = 10;
        for (int number=lowerbound;number<=upperbound;number++){
            product*=number;
        }
        System.out.printf("Factorial: %d",product);
    }
}
