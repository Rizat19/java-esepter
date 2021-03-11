package OOP1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Rizat","rizat@inbox.kz",'f');
        Author author2 = new Author("Symbat","symbat1999@inbox.ru",'f');
//        System.out.println(author1);
//        System.out.println("name is: "+author1.getName());
//        System.out.println("email is: "+author1.getEmail());
//        System.out.println("gender is: "+author1.getGender());

//        Book book1 = new Book("Java for beginners",author1,20.58, 89);
//        System.out.println(book1);
//
//        book1.setPrice(22.36);
//        book1.setQty(84);
//        System.out.println("name is :"+book1.getName());
//        System.out.println("price is :"+book1.getPrice());
//        System.out.println("qty is :"+book1.getQty());
//        System.out.println("author is :"+book1.getAuthor());
//        System.out.println("author name is :"+book1.getAuthor().getName());
//        System.out.println("author email is :"+book1.getAuthor().getEmail());
//
//        Book book2 = new Book("Java tutorial",new Author("Symbat","symbat@gmail.com",'f'),40.2,67);
//        System.out.println(book2);
//
//        System.out.println("author name is: "+book2.getAuthorName());

        Author[] authors = new Author[2];
        authors[0]=author1;
        authors[1]=author2;
        Book book3 = new Book("Java advanced",authors,582.05,52);
        System.out.println(book3);

        System.out.println(book3.getAuthorsNames());
    }
}
