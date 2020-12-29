public class Comment {
    private static int lastId = 0;
    private int id;

    private User owner;
    private Book book;
    private String text;
    private int like;
    private int disLike;

    public Comment(User owner, Book book, String text) {
        lastId++;
        this.id = lastId;

        this.owner = owner;
        this.book = book;
        this.text = text;

        this.like = 0;
        this.disLike = 0;

        book.addComment(this);

    }

    public void setText(String text) {
        if(!text.equals("")){
            this.text = text;
        }
    }

    public String getText() {
        return text;
    }
}
