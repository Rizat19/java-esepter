public class TestAccount {

    public static void main(String[] args) {

        CustomerB customerB = new CustomerB(55, "Rizat", 'f');
        Account account = new Account(78, customerB, 10000);
        System.out.println(account);
        System.out.println(account.deposit(500));
        System.out.println(account.withdraw(6000));
    }
}