package factoryMethodPattern;

public class Sugar extends Product {

    private float price;

    protected Sugar(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getProductType() {
        return "Sugar";
    }

}