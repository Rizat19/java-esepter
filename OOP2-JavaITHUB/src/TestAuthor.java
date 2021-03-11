public class TestAuthor {

    public static void main(String[] args) {

        Author author = new Author("Rizat", "rizat@mail.com", 'w');
        System.out.println(author);
        author.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + author.getName());
        System.out.println("eamil is: " + author.getEmail());
        System.out.println("gender is: " + author.getGender());
    }
}