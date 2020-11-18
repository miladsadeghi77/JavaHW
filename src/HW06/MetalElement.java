package HW06;

public class MetalElement extends Element {


    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber,atomicWeight);
        describeElement();
    }

    @Override
    public void describeElement() {
        System.out.println("\nBase metals are common metals that tarnish, oxidize,or corrode" +
                "relatively quickly when exposed to air or moisture.\n");
    }
}
