package Online_BookStore.Application;

import Online_BookStore.Authors.Author;
import Online_BookStore.Books.Book;
import Online_BookStore.Customers.Customer;
import Online_BookStore.Customers.LoyalCustomer;
import Online_BookStore.Customers.RegularCustomer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    @Test
    void testRegularCustomerCheckout() {
        // Arrange: Set up authors, books, and a regular customer
        Author author1 = new Author("Neharika Gupta");
        Author author2 = new Author("Madhuri Vijay");

        Book book1 = new Book("Book 1 - Adulting", "9789353571504", 450, author1);
        Book book2 = new Book("Book 2 - The Far Field", "9789353570965", 550, author2);

        Customer regularCustomer = new RegularCustomer("Rakesh");

        // Act: Add books to the cart and view the cart
        regularCustomer.addToCart(book1);
        regularCustomer.addToCart(book2);

        List<Book> cart = regularCustomer.viewCart();

        // Assert: Check if the books are in the cart
        assertEquals(2, cart.size(), "Regular customer's cart should contain 2 books");
        assertTrue(cart.contains(book1), "Cart should contain Book 1");
        assertTrue(cart.contains(book2), "Cart should contain Book 2");
    }

    @Test
    void testLoyalCustomerCheckout() {
        // Arrange: Set up authors, books, and a loyal customer
        Author author1 = new Author("Neharika Gupta");
        Author author2 = new Author("Madhuri Vijay");

        Book book1 = new Book("Book 1 - Adulting", "9789353571504", 450, author1);
        Book book2 = new Book("Book 2 - The Far Field", "9789353570965", 550, author2);

        Customer loyalCustomer = new LoyalCustomer("Aniket", 7);

        // Act: Add books to the cart and view the cart
        loyalCustomer.addToCart(book1);
        loyalCustomer.addToCart(book2);

        List<Book> cart = loyalCustomer.viewCart();

        // Assert: Check if the books are in the cart
        assertEquals(2, cart.size(), "Loyal customer's cart should contain 2 books");
        assertTrue(cart.contains(book1), "Cart should contain Book 1");
        assertTrue(cart.contains(book2), "Cart should contain Book 2");

        // Additional Check: Loyalty discount
        double totalPrice = loyalCustomer.checkout();
        assertEquals(900, totalPrice, "Loyal customer should receive a discount on total price");
    }
}
