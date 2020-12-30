import java.util.LinkedList;

public class Product {
    protected static int lastId = 0;
    protected int id;
    protected int amount;
    protected int sold;
    protected String name;
    protected int price;
    protected int rating;
    protected int discount;

    private LinkedList<Comment> comments;

    Product(int amount, String name, int price, int discount) {
        lastId++;
        this.id = lastId;
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.comments = new LinkedList<Comment>();
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

}
