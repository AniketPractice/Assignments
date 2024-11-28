package Online_BookStore.Books;

import Online_BookStore.Authors.Author;

// Book class representing a book.
public class Book {

    private String title;
    private String isbn;
    private double price;
    private Author author;

    // Constructor
    public Book(String title, String isbn, double price, Author author){

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }

        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = author;

    }

    // Getter method
    public String getTitle() {
        return title;
    }


    public double getPrice() {
        return price;
    }

    // Overriding toString() to display the details in readable format.
    @Override
    public String toString(){

        return String.format("%s by %s - ISBN: %s, Price: Rs%.2f", title, author.getName(), isbn, price);

    }

}
