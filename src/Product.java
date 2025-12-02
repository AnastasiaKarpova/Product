public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }
        this.price = price;
    }
    public double totalCost(){
        return price * quantity;

    }
}
