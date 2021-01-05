import java.util.LinkedList;

public class Order {
    private User owner;
    private LinkedList<Product> orderList = new LinkedList<>();

    public int totalPrice(){
        int sum=0;
        for (Product p : this.orderList) {
            sum+= p.getPriceAfterDiscount();
        }
        return sum;
    }

    public void addProduct(Product product){
        this.orderList.add(product);
    }

}
