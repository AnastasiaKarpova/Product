
public class Main{
    public static void main(String[] args){
        Product product = new Product("Glasses", 3);
        product.setPrice(2300);
        //product.setPrice(-2300);
        System.out.println("Name product: "+ product.getName());
        System.out.println("Price product: "+ product.getPrice());
        System.out.println("Quantity product: "+ product.getQuantity());
        System.out.println(product.totalCost());
    }
}
