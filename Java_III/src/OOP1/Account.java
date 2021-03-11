package OOP1;

public class Account {
    private int ID;
    private Customer1 customer1;
    private double balance = 0.0;

    public Account(int ID, Customer1 customer1, double balance) {
        this.ID = ID;
        this.customer1 = customer1;
        this.balance = balance;
    }

    public Account(int ID, Customer1 customer1) {
        this.ID = ID;
        this.customer1 = customer1;
    }

    public int getID() {
        return ID;
    }

    public Customer1 getCustomer1() {
        return customer1;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer1.getName();
    }

    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }

    //вывести деньги
    public Account withdraw(double amount){
        if (balance >= amount){
            this.balance -= amount; //вычесть сумму на баланс
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!"); //Выведенная сумма превышает текущий баланс!
        }
        return  this;
    }


    @Override
    public String toString() {
        return String.format(customer1.getName() + "(" + ID + ")" + "; balance = " + "%.2f",balance);
    }
}
