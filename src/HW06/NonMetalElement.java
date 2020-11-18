package HW06;

public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
        describeElement();
    }

    @Override
    public void describeElement() {
        System.out.println("form acidic oxides, good oxidizing agents, have higher electronegativity,\n" +
                "do not have metallic luster, poor, conductor of heat and electricity, usually brittle,\n" +
                "transparent in a thin sheet\n");
    }
}
