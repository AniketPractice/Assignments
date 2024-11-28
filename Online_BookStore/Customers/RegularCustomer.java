package Online_BookStore.Customers;

// Regular customer class.
public class RegularCustomer extends Customer {

    // Constructor
    public RegularCustomer(String name){

        super(name);            // call the constructor of the parent class (Customer)

    }

    //Override the checkout method for regular customers.
    @Override

    public double checkout(){

        System.out.println();
        double totalAmount = super.totalAmount();
        System.out.println("Total for regular customer: Rs" + totalAmount);
        System.out.println();
        return totalAmount;

    }

}
