public class ComputePI {
    public static void main(String[] args) {
        //Напишите программу, вызываемую ComputePIдля вычисления значения π, используя следующее
        //разложение в ряд. Используйте максимальный знаменатель ( maxDenominator) в качестве условия
        //завершения. Попробуйте maxDenominatorиз 1000, 10000, 100000, 1000000 и сравнить полученный
        //PI. Подходит ли эта серия для вычисления PI?
        double sum = 0.0;
        int maxDenominator = 10000;// Пробуем 10000, 100000, 1000000
//        for (int denominator = 1; denominator <= maxDenominator; denominator+= 2) {
//            // знаменатель = 1, 3, 5, 7, ..., maxDenominator
//            if (denominator % 4 == 1) {
//                sum += (double) 1 / denominator;
//            } else if (denominator % 4 == 3) {
//                sum -= (double) 1 / denominator;
//            } else { // остаток от 0 или 2
//                System.out.println("Невозможно !!!");
//            }
//        }
//        System.out.println(4*sum);
        int maxTerm = 10000;
        for (int term = 1; term <= maxTerm; term ++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            }else{
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        System.out.println(4*sum);
        double abs=(4*sum/Math.PI) * 100;
        System.out.println("abs:"+abs);
    }
}
