package HW04;

public class Fiction extends Book {
  double fiction_Price;
    public Fiction(String book_title) {
        super(book_title);
        setBook_price();
    }

    public double setBook_price()  {
        fiction_Price=24.99;
        return fiction_Price;
    }
}
