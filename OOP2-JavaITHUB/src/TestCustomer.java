public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer(111, "Rizat", 50);
        System.out.println(customer);
        customer.setDiscount(99);
        System.out.println(customer.getDiscount());
        System.out.println(customer.getID());
        System.out.println(customer.getName());
    }
}
