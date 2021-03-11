public class TestBook {
    public static void main(String[] args) {

        Author author = new Author("Levi", "levi@weebmail.com", 'm');
        Book dummyBook = new Book("Art of Cleaning", author, 19.95, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        Book anotherBook = new Book("more Java", new Author("Paul Tan",
                "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
