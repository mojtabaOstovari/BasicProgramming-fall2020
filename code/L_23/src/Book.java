import java.util.LinkedList;

public class Book {

    int id;
    int amount;
    int sold;
    String name;
    int price;
    int rating;
    int discount;

    private String subject;
    private String author;
    private int pages;
    private int year;
    private LinkedList<Comment> comments;

    public Book(int amount, String name, int price, int discount, String subject, String author, int pages, int year) {
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.subject = subject;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.comments = new LinkedList<Comment>();
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }


}
