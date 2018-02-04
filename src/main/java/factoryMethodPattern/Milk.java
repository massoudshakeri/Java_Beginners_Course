package factoryMethodPattern;

// a subclass of concrete Product:
public class Milk extends Product {

    private float price;

    protected Milk(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getProductType() {
        return "Milk";
    }

}