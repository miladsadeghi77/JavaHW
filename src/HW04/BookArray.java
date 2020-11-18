/* b. Write an application named BookArray in which you create an array that holds 10 Books,
some Fiction and some NonFiction. Using a for loop, display details about all 10 books.
Save the file as BookArray.java.*/

package HW04;

import java.util.ArrayList;

public class BookArray {
    static ArrayList<Book> booksList = new ArrayList<Book>();
    public static void main(String[] args){

        Book books;
        books=new Fiction("War And Peace");
        booksList.add(books);
        books=new NonFiction("The prince");
        booksList.add(books);
        books=new NonFiction("The Order of Time");
        booksList.add(books);
        books=new Fiction("Twenty thousand leagues under the sea");
        booksList.add(books);
        books=new NonFiction("Deep Work");
        booksList.add(books);
        books=new NonFiction("The compound effect");
        booksList.add(books);
        books=new Fiction("Crime and Punishment");
        booksList.add(books);
        books=new Fiction("My Autobiography");
        booksList.add(books);
        books=new NonFiction("The 5 AM Club");
        booksList.add(books);
        books=new Fiction("A Confession");
        System.out.println(booksList);
    }

}
