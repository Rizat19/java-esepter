public class Account {

    private int ID;
    private CustomerB customer;
    private double balance;

    public Account(int ID, CustomerB customer) {
        this.ID = ID;
        this.customer = customer;
        balance = 0.0;
    }

    public Account(int ID, CustomerB customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public CustomerB getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeds current balance");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", balance=" + (double)Math.round(balance * 100) / 100 +
                '}';
    }


}
