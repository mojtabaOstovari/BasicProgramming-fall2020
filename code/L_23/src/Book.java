public class Book extends Product {

    private static int changePrice = 0;

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

    public static void setChangePrice(int changePrice) {
        Book.changePrice = changePrice;
    }

    @Override
    public int f() {
        return 4;
    }

    public int getPriceAfterDiscount() {
        return super.getPriceAfterDiscount()
                * (1 - (changePrice)/100);
    }

}
