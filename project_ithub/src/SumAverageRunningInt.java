public class SumAverageRunningInt {
    public static void main(String[] args) {
        //Написать программу , которая называется SumAverageRunningInt производить сумму 1, 2, 3, ...,
        //к 100. Сохраните 1 и 100 в переменных lowerbound и upperbound, чтобы мы могли легко
        //изменять их значения. Также вычислите и отобразите среднее значение.
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        //for
//        for (int number=lowerbound;number<=upperbound;number++){
//            sum+=number;
//        }
//        average=(double) sum/100;
//        System.out.printf("Average: %.2f%n",average);
        //while
//        int number=lowerbound;
//        do {
//            sum+=number;
//            ++number;
//        }
//        while (number<=upperbound);
//        average=(double) sum/upperbound;
//        System.out.printf("Average: %.2f%n",average);

        //Изменить программу , чтобы найти «сумму квадратов» всех чисел от 1 до 100, т .e. 1*1 + 2*2 + 3*3 + ... + 100*100.
//        int number=lowerbound;
//        while (number<=upperbound){
//            sum+=(number*number);
//            ++number;
//        }
//        System.out.println("Summa :"+sum);

        //Измените программу, чтобы получить две суммы: сумму нечетных чисел и сумму четных чисел от 1до 100. Также компьютерная их абсолютная разница.
        int sumOdd=0;
        int sumEven=0;
        int absDiff;
        for (int number=lowerbound;number<=upperbound;number++){
            if(number%2==0){
                sumOdd+=number;
            }else{
                sumEven+=number;
            }
        }
        System.out.println("odd sum:"+sumOdd+", even sum:"+sumEven);
        absDiff=(sumOdd>sumEven)? sumOdd:sumEven;
        System.out.println(absDiff);
    }
}
