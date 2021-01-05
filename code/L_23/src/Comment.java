public class Comment implements Savable {
    private static int lastId = 0;
    private int id;
    private User owner;
    private String text;
    private int like;
    private int disLike;
    private Product product;

    public Comment(User owner, Product product, String text) {
        lastId++;
        this.id = lastId;
        this.owner = owner;
        this.product = product;
        this.text = text;
        this.like = 0;
        this.disLike = 0;
        product.addComment(this);
    }

    public void setText(String text) {
        if(!text.equals("")){
            this.text = text;
        }
    }

    public String getText() {
        return text;
    }

    public void save(){
        //
        //
    }

}
