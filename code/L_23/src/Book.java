public class Book extends Product {

    private String subject;
    private String author;
    private int pages;
    private int year;

    public Book(int amount, String name, int price, int discount, String subject, String author, int pages, int year) {
        super(amount, name, price, discount);
        this.subject = subject;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

}
