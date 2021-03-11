package oop2;

public class TestAuthor {
    public static void main(String[] args) {
        // Test the constructor
        Author author1=new Author("Akbota","akbota@gmail.com",'f');

        //print toString()
        System.out.println(author1);

        //Test setter email
        author1.setEmail("akbota2007@gmail.com");

        System.out.println("name is: "+author1.getName());
        System.out.println("email is: "+author1.getEmail());
        System.out.println("gender is: "+author1.getGender());

        Book book=new Book("Java for beginners",author1, 19.95, 100);
        System.out.println(book);

        System.out.println(book.getAuthorName());

    }
}
