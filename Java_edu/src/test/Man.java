package test;

public class Man {

    private String name;
    private int age;

    public Man(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void showInfo(){
        System.out.println("Name: "+name+", Age: "+age);
    }

    public void setAge(int age){
        if (age>0) {
            this.age=age;
        }
        else{
            System.out.println("Error, age must be above 0!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
