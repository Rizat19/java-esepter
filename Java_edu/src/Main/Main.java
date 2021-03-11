package Main;
import box.Box;
import test.*;

public class Main {
    public static void main(String[] args) {
//        test.Sotrudnik sotrudnik1=new test.Sotrudnik("Иван", "программист", 120000);
//        String info= sotrudnik1.getInfo(3);
//        System.out.println(info);

//        test.Monster monster=new test.Monster(3,4);
//        monster.voice();
//        monster.voice(3);
//        monster.voice(2,"www");
//        System.out.println(monster.getInfo());

//        box.Box box1=new box.Box(10);
//        box.Box box2=box1.increase(3);
//        int result=box1.compare(box2);
//
//        box1.showVolume();
//        box2.showVolume();
//        switch (result){
//            case 1:
//                System.out.println("наша коробка больше");
//                break;
//            case -1:
//                System.out.println("наша коробка меньше");
//                break;
//            case 0:
//                System.out.println("коробки равны");
//                break;
//        }
//
//        box.Box box1=new box.Box(10);
//        box.Box box2=new box.Box(12);
//        box.Box box3 = box1.sumBox(box2);
//        box.Box box4 = new box.Box(box1, box3);
//        box1.showVolume();
//        box2.showVolume();
//        box3.showVolume();
//        double volumeSum = box1.Volume() + box3.Volume();
//        System.out.println("box1 + box3 = " + volumeSum);
//        box4.showVolume();

//        Man man1=new Man("Ivan",27);
//        System.out.println(man1.getAge());

        double area=MyMath.area(10);
        System.out.println(area);

        int sum=MyMath.sum(2,5,6);
        System.out.println(sum);
    }
}
