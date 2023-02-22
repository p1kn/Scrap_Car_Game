public class Vehicle {
final public String model;
final public String producer;
final public int yearOfProduction;
final public String segment;
public double price;


    public Vehicle(String model, String producer, int yearOfProduction, String segment, double price) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.segment = segment;
        this.price = price;
    }
}
