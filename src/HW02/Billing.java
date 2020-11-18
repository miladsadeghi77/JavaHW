/* Create a class named Billing that includes three coverloaded computeBill() methods for a photo book store.
When computeBill() recieves a single parameter, it represents the price of one photo book ordered.
Add 8% tax and return the total due.
When computeBill() recieves two parameters, they represent the price of a photo book and the quantity ordered.
Multiply the two values, add 8% tax, and return the total due.
When computeBill() recieves three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value.
Multiply the quantity and price, reduce the result by the coupon value, and then  add 8% tax and return the total due.
Write a main() method that test all three overloaded methods. Save as Billing.java */
package HW02;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("***** Welcome to  Photo Book Store *****");
        System.out.println("Book" + "\t\t\tValue" +
                "\n1.Tehran photo" + "\t$21.00" +
                "\n2.Isfahan photo" + "\t$30.00" +
                "\n3.Shiraz photo" + "\t$27.00");
        System.out.println("**************************");
        System.out.print("Enter the book number to order:");
        int bookName = get.nextInt();
        System.out.println("Book price with 8% tax: $" + computeBill(bookName)); //method with 1 parameter

        System.out.print("How many of these books do you want?: ");
        int numberOrders = get.nextInt();
        System.out.println("Book price with 8% tax: $" + computeBill(bookName, numberOrders));//method with 2 parameter

        System.out.print("Enter the coupon code: ");
        String coupon = get.next();
        System.out.println("Book price with 20% discount and 8% tax: $" + computeBill(bookName, numberOrders, coupon));//method with 3 parameter
    }

    public static double computeBill(int bookName) {
        double price = 0;
        if (bookName == 1) {
            System.out.println();
            price = 21.00 + ((21.00 * 8) / 100);
        } else if (bookName == 2) {
            price = 30.00 + ((30.00 * 8) / 100);
        } else if (bookName == 3) {
            price = 27.00 + ((27.00 * 8) / 100);
        } else
            System.out.println("number out of range");
        return price;
    }

    public static double computeBill(int bookName, int numberOrders) {
        double price = 0;
        double totalPrice = 0;

        if (bookName == 1) {
            totalPrice = 21.00 * numberOrders;
            price = totalPrice + ((totalPrice * 8) / 100);
        } else if (bookName == 2) {
            totalPrice = 30.00 * numberOrders;
            price = totalPrice + ((totalPrice * 8) / 100);
        } else if (bookName == 3) {
            totalPrice = 27.00 * numberOrders;
            price = totalPrice + ((totalPrice * 8) / 100);
        } else
            System.out.println("number out of range");
        return price;
    }

    public static double computeBill(int bookName, int numberOrders, String coupon) {
        double productPrice = 0;
        double productDiscounts = 0;
        double totalPrice = 0;
        if (coupon.equals("discount")) {
            if (bookName == 1) {
                productPrice = 21.00 * numberOrders;
                productDiscounts = productPrice - ((productPrice * 20) / 100);
                totalPrice = productDiscounts + ((productDiscounts * 8) / 100);

            } else if (bookName == 2) {
                productPrice = 30.00 * numberOrders;
                productDiscounts = productPrice - ((productPrice * 20) / 100);
                totalPrice = productDiscounts + ((productDiscounts * 8) / 100);

            } else if (bookName == 3) {
                productPrice = 27.00 * numberOrders;
                productDiscounts = productPrice - ((productPrice * 20) / 100);
                totalPrice = productDiscounts + ((productDiscounts * 8) / 100);

            } else
                System.out.println("Book number out of range");
        } else {
            System.out.println("discount code is wrong");
        }

        return totalPrice;
    }
}
