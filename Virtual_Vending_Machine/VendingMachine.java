package Virtual_Vending_Machine;

import java.util.*;


// Represents the vending machine
public class VendingMachine implements  VendingMachineInterface, CoinInterface{

    private Map<String, Product> inventory = new HashMap<>();
    private Customer customer;

    //Constructor

    public VendingMachine (Customer customer){

        this.customer = customer;

    }


    // Display available products
    @Override
    public void displayProducts() {

        System.out.println("Available Products: ");
        System.out.println();                                       // For blank space.
        System.out.printf("%-15s : %-8s | %-10s%n", "Products", "Price", "Stock");
        System.out.println();                                       // For blank space.
        for(Product product : inventory.values()){

            if (product.isAvailable()){

                // System.out.printf is used to print formatting text.
                System.out.printf("%-15s : Rs-%-5d | Quantity-%d%n", product.getName(), product.getPrice(), product.getQuantity());

            }
        }
    }

    // Add product to inventory
    @Override
    public void addProducts(Product product) {

        inventory.put(product.getName(), product);

    }

    // Insert coins into the machine
    @Override
    public void insertCoin(Coin coin) {

        customer.insertCoin(coin);

    }

    // Select and purchase a product
    @Override
    public void selectProduct(String productName) {

        Product product = inventory.get(productName);

        if (product != null && product.isAvailable()){

            if (customer.getBalance() >= product.getPrice()){

                product.reduceQuantity();

                customer.deductBalance(product.getPrice());
                System.out.println("Purchased: " + product.getName());


                //Display remaining balance
                System.out.println("Remaining balance is: " + customer.getBalance());

            }
            else {

                System.out.println("Insufficient Balance");

            }

        }
        else {

            System.out.println("Product is not available");

        }

    }











}


