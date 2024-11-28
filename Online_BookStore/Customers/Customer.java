//package Online_BookStore.Customers;
//
//import Online_BookStore.Books.Book;
//import Online_BookStore.Cart.Cart;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//// Customer class representing customer and Implementing the Cart interface.
//public class Customer implements Cart {
//
//    private String name;
//    private List<Book> shoppingCart; // list to store books in shopping cart
//
//    // Constructor to initialize the customer with a name and an empty cart.
//    public Customer (String name){
//
//        this.name = name;
//        this.shoppingCart = new ArrayList<>();
//
//    }
//
//    // Method to add a book
//    @Override
//    public void addToCart(Book book) {
//
//        System.out.println();
//        shoppingCart.add(book);
//        System.out.println(book.getTitle() + " has been added to the cart.");
//
//    }
//
//    // Method to view the items
//    @Override
//    public void viewCart() {
//
//        System.out.println();
//        System.out.println("Shopping Cart for " + name + " :-");
//        for (Book book : shoppingCart){
//
//            System.out.println(book);
//
//        }
//
//    }
//
//    // Method to calculate the total cost
//    @Override
//    public double totalAmount() {
//        double total = 0;
//        for (Book book : shoppingCart){
//
//            total += book.getPrice();
//
//        }
//
//        return total;
//
//    }
//
//    // Method for checkout
//    @Override
//    public double checkout() {
//
//        double Amount = totalAmount();
//        System.out.println("Total amount: Rs" + Amount);
//        return Amount;
//    }
//
//}

package Online_BookStore.Customers;

import Online_BookStore.Books.Book;
import Online_BookStore.Cart.Cart;

import java.util.ArrayList;
import java.util.List;

// Customer class representing customer and Implementing the Cart interface.
public class Customer implements Cart {

    private String name;
    private List<Book> shoppingCart; // list to store books in shopping cart

    // Constructor to initialize the customer with a name and an empty cart.
    public Customer(String name) {
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Method to add a book
    @Override
    public void addToCart(Book book) {
        shoppingCart.add(book);
        System.out.println(book.getTitle() + " has been added to the cart.");
    }

    // Method to view the items and return the cart
    @Override
    public List<Book> viewCart() {
        System.out.println("\nShopping Cart for " + name + " :-");
        for (Book book : shoppingCart) {
            System.out.println(book);
        }
        return shoppingCart; // Returning the list of books
    }

    // Method to calculate the total cost
    @Override
    public double totalAmount() {
        double total = 0;
        for (Book book : shoppingCart) {
            total += book.getPrice();
        }
        return total;
    }

    // Method for checkout
    @Override
    public double checkout() {
        double amount = totalAmount();
        System.out.println("Total amount: Rs" + amount);
        return amount;
    }
}
