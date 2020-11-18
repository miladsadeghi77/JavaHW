/* Create an abstract class name element that holds properties of elements, including their symbols, atomic number, and
atomic weight. Include a construct or that requires values for all three properties and get methods for each value.
(For example, the symbol for carbon is see, is atomic number is six and is atomic weight is 1201. You can find these
values by reading a periodic table in a chemistry reference or by searching the web). Also include an abstract method
name describe element(). Create two extended classes name metal element and nine MetalElement. Each contains and
described Element() methods that display the detail of the element and a brief explanation of the properties
of the element type. For example, metals are good conductors of electricity, while nonmetals are poor conductors.
Write an application name ElementArray that creates and display an array that holes at least two elements of each type.
Save files as Element.java, MetalElement.java, NonMetalElement.java and ElementArray.java */

package HW06;

public abstract class Element {
    protected String symbol;
    protected int atomicNumber;
    protected double atomicWeight;

    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }
    public abstract void describeElement();
    @Override
    public String toString() {
        return "MetalElement{" +
                "symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicWeight=" + atomicWeight +
                '}' ;
    }
}

