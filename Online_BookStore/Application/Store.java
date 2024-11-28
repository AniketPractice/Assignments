package Online_BookStore.Application;

import Online_BookStore.Authors.Author;
import Online_BookStore.Books.Book;
import Online_BookStore.Customers.Customer;
import Online_BookStore.Customers.LoyalCustomer;
import Online_BookStore.Customers.RegularCustomer;

// Main class.
public class Store {

    public static void main(String[]args){

        // Creating two authors.
        Author author1 = new Author("Neharika Gupta");
        Author author2 = new Author("Madhuri Vijay");

        // Creating two books
        Book book1 = new Book("Book 1 - Adulting", "9789353571504", 450, author1);
        Book book2 = new Book("Book 2 - The Far Field", "9789353570965", 550, author2);

        // Creating a regular customer
        Customer regularCustomer = new RegularCustomer("Rakesh");

        // adding books to cart
        System.out.println("---------------Books added by regular customer---------------");

        regularCustomer.addToCart(book1);
        regularCustomer.addToCart(book2);

        // viewing cart
        regularCustomer.viewCart();
        regularCustomer.checkout();

        // creating a loyal customer
        Customer loyalCustomer = new LoyalCustomer("Aniket", 7);

        // adding books to cart
        System.out.println("---------------Books added by loyal customer--------------- ");
        loyalCustomer.addToCart(book1);
        loyalCustomer.addToCart(book2);

        // viewing cart
        loyalCustomer.viewCart();
        loyalCustomer.checkout();


    }

}
