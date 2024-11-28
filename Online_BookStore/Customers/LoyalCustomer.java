package Online_BookStore.Customers;

import Online_BookStore.Cart.Cart;
import Online_BookStore.Discounts.Discounts;

// Loyal customer class.
public class LoyalCustomer extends Customer implements Cart, Discounts {

    private int purchaseCount;              // no. of purchase made by the customer
    private static final double DISCOUNT_RATE = 0.10;           // 10% discount for loyal customer.

    // Constructor
    public LoyalCustomer(String name, int purchaseCount) {
        super(name);
        this.purchaseCount = purchaseCount;
    }

    // Override the checkout method to apply a discount for loyal customers
    @Override

    public double checkout(){

        System.out.println();
        double Amount = super.totalAmount();
        System.out.println("Total before discount is: Rs" + Amount);

        // Apply discount id the customer has made more than 5 purchases
        if(purchaseCount > 5){

            Amount = appliedDiscount(Amount);
            System.out.println("Discount applied 10% off for loyal customers.");

        }else{

            System.out.println("Discount not applied");

        }

        System.out.println("Total after discount: Rs" + Amount);
        return Amount;
    }

    // Method to calculate the discounted amount.
    @Override
    public double appliedDiscount(double Amount) {
        return Amount * (1 - DISCOUNT_RATE);

    }
}
