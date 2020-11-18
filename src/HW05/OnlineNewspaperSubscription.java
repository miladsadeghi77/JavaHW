package HW05;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        this.address=address;
        if(address.contains("@")) {
            rate = 9;
        }else{
            System.out.println("Error");
            rate=0;
            }
        }
}
