import java.util.Arrays;

public class BookB {

    private String name;
    private Author [] author;
    private double price;
    private int qty;

    public BookB(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public BookB(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }


    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BookB{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(author) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}