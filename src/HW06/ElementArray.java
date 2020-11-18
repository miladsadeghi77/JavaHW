package HW06;
import java.util.ArrayList;

public class ElementArray {
    static ArrayList<Element> elementList = new ArrayList<Element>();

    public static void main(String[] args) {
        Element elements;
        elements=new MetalElement("Pb",82,207.2);
        elementList.add(elements);
        System.out.println(elementList.get(0)+"\n");
        elements=new MetalElement("Sn",50,118.71);
        elementList.add(elements);
        System.out.println(elementList.get(1)+"\n");
        elements=new NonMetalElement("N",50,14.007);
        elementList.add(elements);
        System.out.println(elementList.get(2)+"\n");
        elements=new NonMetalElement("O",8,15.999);
        elementList.add(elements);
        System.out.println(elementList.get(3)+"\n");
    }
}
