package HW04;

public class UseBook {
    public static void main(String[] args)
    {
        Fiction fbook = new Fiction("War And Peace");
        NonFiction nbook = new NonFiction("The prince");
        System.out.println(fbook.getBook_title() + " " + fbook.getBook_price());
        System.out.println(nbook.getBook_title() + " " + nbook.getBook_price());
    }
}
