package Ex4;

public class Main {
    public static void main(String[] args) {
        ProductManager.addProduct(new Product("Product 1", 10.0));
        ProductManager.addProduct(new Product("Product 2", 15.0));
        ProductManager.removeProduct(new Product("Product 1", 10.0));
        ProductManager.listProducts();
    }
}
