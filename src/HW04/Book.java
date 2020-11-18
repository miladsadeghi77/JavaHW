/* a. Create an abstract class named Book. Include a String field for the book’s title and a double field for
the book’s price. Within the class, include a constructor that requires the book title, and add two get methods—one
that returns the title and one that returns the price. Include an abstract method named setPrice().
Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price
for all Fiction Books to $24.99 and for all NonFictionBooks to $37.99. Write a constructor for each subclass, and
include a call to setPrice() within each. Write an application demonstrating that you can create both a Fiction and a
NonFiction Book, and display their fields. Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java. */

package HW04;

public abstract class Book {
    private String book_title;
   protected double book_price;
    public Book(String book_title) {
        this.book_title = book_title;
    }
    public String getBook_title() {
        return book_title;
    }

    public double getBook_price() {
        return setBook_price();
    }

    public abstract double setBook_price();

    @Override
    public String   toString() {
        return "Book{" +
                "book_title='" + book_title + '\'' +
                ", book_price=" + book_price +
                '}';
    }
}
