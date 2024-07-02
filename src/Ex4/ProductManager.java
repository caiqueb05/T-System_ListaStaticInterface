package Ex4;

import java.util.ArrayList;

public class ProductManager {
    private static ArrayList<Product> products = new ArrayList<Product>();

    public static void addProduct(Product product){
        products.add(product);
    }

    public static void removeProduct(Product product){
        products.remove(product);
    }

    public static void listProducts(){
        for(Product product : products){
            System.out.println("Name: " + product.name + " Price: " + product.price);
        }
    }
}
