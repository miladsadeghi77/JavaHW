package HW05;

public class PhysicalNewspaperSubscription  extends NewspaperSubscription{
    @Override
    public void setAddress(String address) {
        this.address=address;
        char[] chars = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        if(sb.length()>0) {
            rate = 15;
        }else{
            System.out.println("Error");
            rate=0;
        }
    }

    }

