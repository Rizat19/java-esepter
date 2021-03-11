public class Employee {
    //1.4 Упражнение: Создать согласно диаграмме класс Employee
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return getSalary() + (getSalary() * percent) / 100;
    }
}