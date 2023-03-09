public class Vehicle {
final public String producer;
final public String color;
final public int mileage;
final public String segment;
final public boolean isEngineOk;
final public boolean isSuspensionOk;
final public boolean isBodyOk;
final public boolean isGearboxOk;
final public boolean areBrakesOk;
public double price;


    public Vehicle(String producer, String color, int mileage, String segment, boolean isEngineOk, boolean isSuspensionOk, boolean isBodyOk, boolean isGearboxOk, boolean areBrakesOk, double price) {
        this.producer = producer;
        this.color = color;
        this.mileage = mileage;
        this.segment = segment;
        this.isEngineOk = isEngineOk;
        this.isSuspensionOk = isSuspensionOk;
        this.isBodyOk = isBodyOk;
        this.isGearboxOk = isGearboxOk;
        this.areBrakesOk = areBrakesOk;
        this.price = price;
    }
}
