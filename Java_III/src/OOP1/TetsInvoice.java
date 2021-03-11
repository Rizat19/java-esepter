package OOP1;


public class TetsInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(2, new Customer(1,"Riz",5),1000);
        System.out.println(invoice.getCustomer());
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
