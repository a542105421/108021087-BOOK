/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Book book1;
        book1 = new Book();
        book1.setName("Harry Potter and the Philosopher's Stone");
        book1.setAutor("Rowling, J.K.");
        book1.setPublisher("Scholastic");
        book1.setISBN("9780590353427");
        book1.setType("fantasy novels written");
        System.out.println(book1.getName());
        System.out.println(book1.getAutor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getISBN());
        System.out.println(book1.getType());
    }
}