/* b. Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to "0", the age to 0, and the BloodData to "O" and "+".
Create an overloaded constructor that provides values for each field. Also provide get methods for each field.
Save the file as Patient.java. Create an application named TestPatient that demonstrates that each method works
correctly, and save it as TestPatient.java. */

package HW03;

public class Patient {
    private final int idNumber;
    private final int age;
    private BloodData newBloodData;

    public Patient( int id, int age,BloodData bloodData) {
        this.newBloodData=bloodData;
        idNumber = id;
        this.age = age;
    }

    public Patient() {
        idNumber = 0;
        age = 0;
        newBloodData = new BloodData("o", "+");
    }


    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getBType() {
        return newBloodData.getBloodType();
    }

    public String getFactor() {
        return newBloodData.getRhFactor();
    }

}
