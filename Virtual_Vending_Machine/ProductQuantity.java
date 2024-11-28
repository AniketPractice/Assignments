package Virtual_Vending_Machine;

// interface defines product quantities
public interface ProductQuantity {

    void reduceQuantity();                  // reduce the quantity when a product is purchased.
    boolean isAvailable();                  // show the available products.

}
