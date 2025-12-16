public record Product(String name, double price) {
    public Product {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Наименование продукта не может быть пустым либо отсутствовать");
        }
        if(price <= 0){
            throw new IllegalArgumentException("Цена не может быть отрицательной либо равной 0");
        }
    }

}
