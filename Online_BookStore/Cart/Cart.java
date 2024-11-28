package Online_BookStore.Cart;

import Online_BookStore.Books.Book;
import java.util.List;

// Cart interface defines methods to add, view, checkout and total.
public interface Cart {

    void addToCart(Book book);      // add a book to cart
    List<Book> viewCart();               // to view the books
    double totalAmount();                 // calculate the total
    double checkout();              // checkout and return total amount.

}
