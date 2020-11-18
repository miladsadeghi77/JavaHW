/* Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation().
The first method takes one String parameter that represents a customer's last name, it displays the salutation
"Dear Mr. or Ms." followed by the last name. The second method accepts two String parameters that
represent a first and last name, and it displays the greeting "Dear" followed by the first name, a space,
and the last name. After each salutation, display the rest of a short business letter: "Thank you for your recent order.
" Write a main() method that tests each overloaded method. Save the file as FormLetterWriter.java. */


package HW01;

import java.util.Scanner;

public class FromLetterWriter {
    public static void main(String[] args) {
        String firstName="";
        String lastName="";
        Scanner get = new Scanner(System.in);
        System.out.print("Please Enter the First name: ");
        firstName = get.nextLine();
        System.out.print("and Last name: ");
        lastName = get.nextLine();
        System.out.println( displaySalutation(lastName)+ "\nThank you for your recent order");
        System.out.println( displaySalutation(firstName,lastName) + "\nThank you for your recent order");
    }

    public static String displaySalutation(String lastName) {
        return "salutation Dear Mr. or Ms "+lastName;
    }
    public static String displaySalutation(String firstName,String lastName) {
        return "greeting Dear "+ firstName+" "+lastName;
    }
}
