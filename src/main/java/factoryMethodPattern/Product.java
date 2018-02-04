package factoryMethodPattern;


// We have an abstract class which defines a product.
// This is the supertype of all products which are produced by the factory:

public abstract class Product {

    public abstract float getPrice();

    public String getProductType() {
        return "Unknown Product";
    }
}
