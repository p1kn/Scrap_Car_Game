public class Car extends Vehicle{

    public Car(String producer, String color, int mileage, String segment, boolean isEngineOk, boolean isSuspensionOk, boolean isBodyOk, boolean isGearboxOk, boolean areBrakesOk, double price) {
        super(producer, color, mileage, segment, isEngineOk, isSuspensionOk, isBodyOk, isGearboxOk, areBrakesOk, price);
    }

    @Override
    public String toString() {
        return "Samochod osobowy marki: " +
                producer +
                ", kolor: " + color +
                ", przebieg: " + mileage + "km"+
                ", segment: " + segment + "\n" +
                "Stan podzespołów: \n" +
                "- silnik sprawny?: " + isEngineOk + "\n" +
                "- zawieszenie sprawne?: " + isSuspensionOk + "\n" +
                "- karoseria sprawna?: " + isBodyOk + "\n" +
                "- przekładnia sprawna?: " + isGearboxOk + "\n" +
                "- hamulce sprawne?: " + areBrakesOk + "\n" +
                "Wartość auta: " + price +  "\n" ;

    }
}
