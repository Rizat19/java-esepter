public class Fibonacci {
    public static void main(String[] args) {
        int n = 3; // Индекс n для F (n), начиная с n = 3, поскольку n = 1 и n= 2 предопределены
        int fn; // F (n) для вычисления
        int fnMinus1 = 1; // F (n-1), инициализация F (2)
        int fnMinus2 = 1; // F (n-2), инициализация F (1)
        int nMax = 20; // максимум n, включая
        int sum = fnMinus1 + fnMinus2; // Нужна сумма для вычисления среднего двойное среднее;
        System.out.println ("Первые " + nMax + " числа Фибоначчи:");
        System.out.print(fnMinus2+" "+fnMinus1+" ");
        while(n<=nMax){
            fn=fnMinus1+fnMinus2;
            sum+=fn;
            System.out.print(fn+" ");
            ++n;
            fnMinus2=fnMinus1;
            fnMinus1=fn;
        }

        double average=(double) sum/nMax;
        System.out.println("\nВ среднем: "+average);
    }
}
