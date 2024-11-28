package Virtual_Vending_Machine;

// Interface defines operations for a vending machine.
public interface VendingMachineInterface {

    void displayProducts();                     // display list of products available in vending machine.
    void addProducts(Product product);          // adding a product to vending machine.
    void selectProduct(String productName);     // selecting a product using name.

}
