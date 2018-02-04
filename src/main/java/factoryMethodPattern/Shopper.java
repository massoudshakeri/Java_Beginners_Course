package factoryMethodPattern;

public class Shopper {

    public static void main(String args[]) {

        // At first we create a shopping-cart
        Product[] cart = new Product[3];

        // Shopping
        // Whenever we need a product (milk or sugar), we call the factory method instead of the constructor of the concrete Products.
        cart[0] = ProductFactory.createProduct("Milk");
        cart[1] = ProductFactory.createProduct("Sugar");
        cart[2] = ProductFactory.createProduct("Bread");
        System.out.print(cart[0].getProductType());
    }
}