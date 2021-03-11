package OOP1;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1, new Customer1(2,"Riz",'f'), 300000);
        System.out.println(account);
        System.out.println(account.deposit(20000));
        System.out.println(account.withdraw(2500000));
        System.out.println(account);
    }
}
