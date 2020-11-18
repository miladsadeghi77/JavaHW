package HW03;

public class TestPatient {
    public static void main(String[] args)
    {
       Patient test1 = new Patient();
        Patient test2 = new Patient(1, 19, new BloodData("B", "+"));

        System.out.println("default constructor. \n The ID number is: "
                + test1.getIdNumber() + "\t  the age is: "
                + test1.getAge() + "\t  the blood type is: "
                + test1.getBType() + "\t the RH factor is: "
                + test1.getFactor());
        // showing the overloaded constructor that shows values as arguments passed in obj2 object above
        System.out.println("overloaded constructor with provided values.\n The ID number is: "
                + test2.getIdNumber() + "\t the age is: "
                + test2.getAge() + "\t the blood type is: "
                + test2.getBType() + "\t  the RH factor is: "
                + test2.getFactor());

    }
}
