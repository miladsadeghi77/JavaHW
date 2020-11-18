/* a. Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB)
and an Rh factor (the factors are + and -). Create a default constructor that sets the fields to "O" and "+",
and an overloaded constructor that requires values for both fields. Include get and set methods for each field.
Save this file as BloodData.java. Create an application named TestBloodData that demonstrates that each method works correctly.
Save the application as TestBloodData.java. */

package HW03;

public class BloodData {
    private String bloodType ;
    private String rhFactor;

    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String type, String factor)
    {
        bloodType = type;
        rhFactor = factor;
    }

    public void setBloodType(String type)
    {
        this. bloodType = type;
    }

    public void setRhFactor( String factor)
    {
        this. rhFactor = factor;
    }

    public String getBloodType()
    {
        return bloodType ;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}
