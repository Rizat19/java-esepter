public class Arrays {
    public static void main(String[] args) {
        // массив -набор однотипных переменных
        /*Создать массив чисел, и проинициализировать его значениями от 100 до 1000.
        Создать второй массив по длине равный первому (использовать свойство length). Проинициализировать его значениями, взятыми из первого массива, но в обратном порядке.
        В цикле for each вывести все элементы второго массива.*/
        int[] nums=new int[900];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=i+100;
        }
        for (int i: nums) {
            System.out.println(i);
        }
        System.out.println("numsReverse:");
        int[] numsRevesre=new int[nums.length];
        for (int i=0, j= nums.length-1; i<numsRevesre.length; i++,j--) {
            numsRevesre[j]=nums[i];
        }
        for (int i:numsRevesre) {
            System.out.println(i);
        }


    }
}
