public class HarmonicSum {
    public static void main(String[] args) {
        //Напишите программу, вызываемую HarmonicSum для вычисления суммы гармонического ряда, как
        //показано ниже, где n=50000. Программа вычисляет сумму как слева направо, так и справа
        //налево . Две суммы одинаковы? Получите абсолютную разницу между этими двумя суммами и
        //объясните разницу. Какая сумма более точная?

        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        // цикл for для суммирования слева направо
        for (int denominator = 1; denominator <= maxDenominator; ++ denominator){
            sumL2R+=(double) 1/denominator;
        }
        System.out.println("Сумма слева направо:" + sumL2R);
        // цикл for для суммирования справо налево
        for (int denominator = maxDenominator; denominator >= 1; -- denominator){
            sumR2L+=(double) 1/denominator;
        }
        System.out.println("Сумма справо налево:" + sumR2L);
        absDiff=Math.max(sumL2R,sumR2L);
        System.out.println("Абсолютная разница: "+absDiff);
    }
}
