public class Main{
    public static void main(String[] args) {
        try{
            Product prod = new Product("Icecream", 300);
            System.out.println(prod);
            Product prod2 = new Product("", 10);
            //System.out.println(prod2);
            Product prod1 = new Product("Cream", 0);
            //System.out.println(prod1);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
