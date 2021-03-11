package test;

public class Dog {
    String name; // кличка
    String breed; // порода
    int speed; // скорость

    void run(){
        for(int i=1;i<=speed;i++){
            if (i==speed){
                System.out.print("бегу.\n");
            }else {System.out.print("бегу,");}
        }
    }

    String info(){
        return name+" "+breed+" "+speed;
    }
}
