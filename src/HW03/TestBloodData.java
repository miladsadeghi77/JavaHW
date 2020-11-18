package HW03;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData testBlood1 = new BloodData();
        System.out.println("Blood Type: " + testBlood1.getBloodType());
        System.out.println("RH Factor: " + testBlood1.getRhFactor());

        BloodData testBlood2 = new BloodData();
        testBlood2.setBloodType("A");
        testBlood2.setRhFactor("-");
        System.out.println("Blood Type: " + testBlood2.getBloodType());
        System.out.println("RH Factor: " + testBlood2.getRhFactor());

        BloodData testBlood3 = new BloodData("B", "+");
        System.out.println("Blood Type: " + testBlood3.getBloodType());
        System.out.println("RH Factor: " + testBlood3.getRhFactor());
    }
}
