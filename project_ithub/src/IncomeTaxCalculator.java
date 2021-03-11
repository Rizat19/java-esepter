public class IncomeTaxCalculator {
    public static void main(String[] args) {
        int size=7;
        int p;
        for(int row=0;row<=size;row++){
            if(row==0){
                System.out.print("*|");
            }
            else{
                System.out.print(row+"|");}
            for(int col=1;col<=size;col++){

               if (row==0){
                   p=(row+1)*col;
               }
               else {p=row*col;}
               System.out.printf(" %4d",p);
            }
            System.out.println();
        }
    }
}
