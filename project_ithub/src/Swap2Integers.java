public class Swap2Integers {
    public static void main(String[] args) {
        int first=9;
        int second=-9;
        int temp;
        System.out.print(first+","+second);
        temp=first;
        first=second;
        second=temp;
        System.out.println("\nПосле обмена: 1:"+first+", 2:"+second);

    }
}
