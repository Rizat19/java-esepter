package test;

public class Sotrudnik {
    String name;
    String position;
    int salary;

    Sotrudnik(String name, String position, int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }

    public String getInfo(int nMonth){
        this.salary=salary*nMonth;
        return "Сотрудник "+name+","+"должность "+position+","+"за последние "+nMonth+" месяцев получил "+salary;
    }
}
