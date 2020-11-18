package HW04;

public class NonFiction extends Book {
    double NonFiction_price;
    public NonFiction(String book_title) {
        super(book_title);
        setBook_price();
    }

    public double setBook_price() {
        NonFiction_price=37.99;
        return NonFiction_price;
    }
}
