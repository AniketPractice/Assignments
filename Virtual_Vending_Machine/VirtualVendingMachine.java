package Virtual_Vending_Machine;


// Class to test the vending machine functionality
public class VirtualVendingMachine{

    public static void main (String[]args){

        // Creating a customer
        Customer customer = new Customer();

        // Creating a vending machine with products
        VendingMachine vendingMachine = new VendingMachine(customer);
        vendingMachine.addProducts((new Product("Biscuits",10, 10)));
        vendingMachine.addProducts((new Product("Wafers",20, 10)));
        vendingMachine.addProducts((new Product("Soda",40, 20)));
        vendingMachine.addProducts((new Product("Cake",50, 5)));

        //Display available products
        vendingMachine.displayProducts();
        System.out.println();                               //For blank spaces.

        // Customer inserts coin
        System.out.println("Money Inserted by the customer: ");
        vendingMachine.insertCoin(Coin.FIFTY);
        System.out.println();                               //For blank spaces.

        // Customer purchases a product
        System.out.println("Product purchased by the customer: ");
        vendingMachine.selectProduct("Soda");
        System.out.println();                               //For blank spaces.


        //Display products again after purchase
        vendingMachine.displayProducts();

    }

}