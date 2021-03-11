package test;

public class Monster {
    int nEye;
    int nLeg;
    int nHand;

    Monster(){
        nEye=2;
        nLeg=2;
        nHand=2;
    }

    Monster(int nEye){
        this.nEye=nEye;
        nHand=2;
        nLeg=2;
    }

    Monster(int nEye, int nHand){
        this.nEye=nEye;
        this.nHand=nHand;
        nLeg=2;
    }

    Monster(int nEye, int nHand, int nLeg){
        this.nEye=nEye;
        this.nHand=nHand;
        this.nLeg=nLeg;
    }

    public String getInfo(){
        return nEye+","+nLeg+","+nHand;
    }

    void voice(){
        System.out.print("Голос ");
    }

    void voice(int i){
        int k=1;
        while(k<=i){
            System.out.print("Голос ");
             k++;
        }
        System.out.println();
    }

    void voice(int i, String word){
        int k=1;
        while(k<=i){
            System.out.print(word+" ");
            k++;
        }
    }
}
