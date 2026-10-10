package pr2.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');

        System.out.println(author);
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("TanAhTeck@somewhere.com");
        System.out.println(author.getEmail());
    }
}
