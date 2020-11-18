package HW05;

public class DemoSubscriptions {
    public static void main(String args[]) {
       PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
        OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
        pnsGood.setName("Milad");
        pnsGood.setAddress("12 Bolivar ray");
        display(pnsGood);
        pnsBad.setName("Hossein");
        pnsBad.setAddress("Iran Street");
        display(pnsBad);
        onsGood.setName("Reza");
        onsGood.setAddress("Reza@gmail.com");
        display(onsGood);
        onsBad.setName("Ali");
        onsBad.setAddress("Ali Street");
        display(onsBad);
    }

    public static void display(NewspaperSubscription n) {
        System.out.println("Name: " + n.getName() + " \tAddress: " +
                n.getAddress() + " \tRate: " + n.getRate() + "\n");
    }
}
