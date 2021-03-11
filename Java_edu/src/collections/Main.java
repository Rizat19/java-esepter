package collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String[] employess={
//                "Arman",
//                "Symbat",
//                "Akbota"
//        };
//
//        String[] second=new String[employess.length+1];
//        for (int i=0;i< second.length;i++){
//            if(i== second.length-1){
//                second[i]="";
//            }
//            else{second[i]=employess[i];}
//        }
//        second[second.length-1]="Fariza";
//        employess=second;
//        employess[1]=null;
//        String[] newNames=new String[employess.length-1];
//        for (int i=0, j=0;i< employess.length;i++){
//            if (employess[i]!=null){
//                newNames[j]=employess[i];
//                j++;
//            }
//        }
//        employess=newNames;
//        for (String name : employess
//        ) {
//            System.out.println(name);
//        }

//        MyArrayList employess=new MyArrayList();
//        employess.add("Nikita");
//        employess.add("Igor");
//        employess.add("Zhanna");
//        employess.add("Akbota");
//
//        employess.remove("Zhanna");
//
//        for (int i=0; i< employess.getSize();i++){
//            System.out.println(employess.get(i));
//        }

//        String s="Igor. He is programmist";
//        String name=s.substring(0,4);
//        System.out.println(name);

//        String man="Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
//        String name=man.substring(4,8);
//        String position=man.substring(54,65);
//        int age=Integer.parseInt(man.substring(14,16));
//        double height=Double.parseDouble(man.substring(32,37));
//
//        Man man1=new Man(name,position,age,height);
//        System.out.println(man1.getName());
//        System.out.println(man1.getAge());
//        System.out.println(man1.getHeight());
//        System.out.println(man1.getPosition());

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        ArrayList<String> names=new ArrayList<>();
        names.add("Aidar");
        names.add("Aida");
        names.add("Akbota");
        names.add("Kairat");
        names.add("Symba");
        names.add("Aiman");
        names.add("Sergey");
        names.add("Ivan");
        names.add("Nikita");
        names.add("Peri");

        ArrayList<String> s=new ArrayList<>();
        for (int i=0;i< numbers.size();i++){
            s.add(numbers.get(i)+"-"+names.get(i));
        }
        for (String word: s){
            System.out.println(word);
        }

    }
}








