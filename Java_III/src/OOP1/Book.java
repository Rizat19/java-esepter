package OOP1;

import java.util.Arrays;

public class Book {
    private String name; // book name
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String getAuthorsNames(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<authors.length;i++){
            stringBuffer.append(authors[i].getName());
            if (i != authors.length-1){
                stringBuffer.append(" ,");
            }
        }

        return stringBuffer.toString();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
