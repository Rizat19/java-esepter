public class TestInvoice {
    public static void main(String[] args) {

        Customer customer = new Customer(111, "Arisha", 99);
        Invoice invoice = new Invoice(333, customer, 1000);
        System.out.println(invoice);
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
