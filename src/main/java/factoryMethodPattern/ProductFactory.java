package factoryMethodPattern;

public class ProductFactory {

	// All we need now is the factory with its factory-method.
	// The factory method contains all initialization data for the objects it produces:
    public static Product createProduct(String what) {

        // When sugar is requested, we return sugar:
        if (what.equals("Sugar")) {
            return new Sugar(1.49F);
        }
        // When milk is needed, we return milk:
        else if (what.equals("Milk")) {
            return new Milk(0.99F);
        }
        // If the requested Product is not available, 
        //   we produce Milk for a special price.
        else {
            return new Milk(0.79F);
        }
    }
}