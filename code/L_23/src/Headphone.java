public class Headphone extends Product {

    private String brand;
    private int impedance;
    private String type;

    public Headphone(int amount, String name, int price, int discount, String brand, int impedance, String type) {
        super(amount, name, price, discount);
        this.brand = brand;
        this.impedance = impedance;
        this.type = type;
    }
}
