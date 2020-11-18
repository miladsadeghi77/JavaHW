# Solve Java Programming book exercise By Joyce Farrell

**HW01** Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation().
The first method takes one String parameter that represents a customer's last name, it displays the salutation
"Dear Mr. or Ms." followed by the last name. The second method accepts two String parameters that
represent a first and last name, and it displays the greeting "Dear" followed by the first name, a space,
and the last name. After each salutation, display the rest of a short business letter: "Thank you for your recent order.
" Write a main() method that tests each overloaded method. Save the file as FormLetterWriter.java.

**HW02** Create a class named Billing that includes three coverloaded computeBill() methods for a photo book store.
When computeBill() recieves a single parameter, it represents the price of one photo book ordered.
Add 8% tax and return the total due.
When computeBill() recieves two parameters, they represent the price of a photo book and the quantity ordered.
Multiply the two values, add 8% tax, and return the total due.
When computeBill() recieves three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value.
Multiply the quantity and price, reduce the result by the coupon value, and then  add 8% tax and return the total due.
Write a main() method that test all three overloaded methods. Save as Billing.java 

**HW03** a. Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB)
and an Rh factor (the factors are + and -). Create a default constructor that sets the fields to "O" and "+",
and an overloaded constructor that requires values for both fields. Include get and set methods for each field.
Save this file as BloodData.java. Create an application named TestBloodData that demonstrates that each method works correctly.
Save the application as TestBloodData.java. 
b. Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to "0", the age to 0, and the BloodData to "O" and "+".
Create an overloaded constructor that provides values for each field. Also provide get methods for each field.
Save the file as Patient.java. Create an application named TestPatient that demonstrates that each method works
correctly, and save it as TestPatient.java.

**HW04** a. Create an abstract class named Book. Include a String field for the book’s title and a double field for
the book’s price. Within the class, include a constructor that requires the book title, and add two get methods—one
that returns the title and one that returns the price. Include an abstract method named setPrice().
Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price
for all Fiction Books to $24.99 and for all NonFictionBooks to $37.99. Write a constructor for each subclass, and
include a call to setPrice() within each. Write an application demonstrating that you can create both a Fiction and a
NonFiction Book, and display their fields. Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.
b. Write an application named BookArray in which you create an array that holds 10 Books,
some Fiction and some NonFiction. Using a for loop, display details about all 10 books.
Save the file as BookArray.java.

**HW05** Create an abstract NewspaperSubscription class with fields for the subscriber name, address, and rate.
Include get and set methods for the name field and get methods for the address and subscription rate;
the setAddress() method is abstract.
Create two subclasses named PhysicalNewspaperSubscription and OnlineNewspaperSubscription. The parameter for
the setAddress() method of the PhysicalNewspaperSubscription class must contain at least one digit; otherwise,
an error message is displayed and the subscription rate is set to 0. If the address is valid, the subscription rate is
assigned $15. The parameter for the setAddress() method of the OnlineNewspaperSubscription class must contain an at
sign (@) or an error message is displayed. If the address is valid, the subscription rate is assigned $9.

**HW06** Create an abstract class name element that holds properties of elements, including their symbols, atomic number, and
atomic weight. Include a construct or that requires values for all three properties and get methods for each value.
(For example, the symbol for carbon is see, is atomic number is six and is atomic weight is 1201. You can find these
values by reading a periodic table in a chemistry reference or by searching the web). Also include an abstract method
name describe element(). Create two extended classes name metal element and nine MetalElement. Each contains and
described Element() methods that display the detail of the element and a brief explanation of the properties
of the element type. For example, metals are good conductors of electricity, while nonmetals are poor conductors.
Write an application name ElementArray that creates and display an array that holes at least two elements of each type.
Save files as Element.java, MetalElement.java, NonMetalElement.java and ElementArray.java 

**HW07** Create an interface named Turner, with a single method named turn(). Create a class named Leaf that implements turn()
to display Changing colors. Create a class named Page that implements turn() to display Going to the next page.
Create a class named Pancake that implements turn() to display Flipping.
Think of two more objects that use turn(), create classes for them, and then add objects to the DemoTurners2 application.
Save the files, using the names of new objects that use turn().
