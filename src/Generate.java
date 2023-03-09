import java.util.ArrayList;
import java.util.Random;

public class Generate {
    public static final String[] producerList = {"VW", "Audi", "Seat", "Skoda", "Volvo", "Jeep", "Mercedes", "Mazda", "Bmw"};
    public static final String[] colorList = {"Czarny", "Niebieski", "Czerwony", "Biały", "Srebrny", "Żółty", "Zielony", "Różowy"};
    public static final String[] segmentList = {"Budget", "Standard", "Premium"};

    public static final String[] damageAcceptationList = {"nieuszkodzone", "uszkodzone", "uszkodzone zawieszenie"};


    public ArrayList<Vehicle> carBase = new ArrayList<>();
    public ArrayList<Customer> customerBase = new ArrayList<>();

    public void createCarBase() {
        for (int i = 0; i < 10; i++) {
            carBase.add(generateCar());
        }
    }

    public void createCustomerBase() {
        for (int i = 0; i < 5; i++) {
            customerBase.add(generateCustomer());
        }
    }

    public void showCarBase() {
        for (int i = 0; i < carBase.size(); i++) {
            System.out.println(i + 1 + ": " + carBase.get(i));
        }
    }

    public void showCustomerBase() {
        for (int i = 0; i < customerBase.size(); i++) {
            System.out.println(i + 1 + ": " + customerBase.get(i));
        }
    }

    public Car generateCar() {
        Random random = new Random();
        int x = generateProducer();
        int y = generateColor();
        int carMileage = random.nextInt(50000) + 10000;
        int z = generateSegment();
        boolean isEngineOk = generatePartStatus();
        boolean isSuspensionOk = generatePartStatus();
        boolean isBodyOk = generatePartStatus();
        boolean isGearboxOk = generatePartStatus();
        boolean areBrakesOk = generatePartStatus();
        double price = generatePrice(z, isEngineOk, isSuspensionOk, isBodyOk, isGearboxOk, areBrakesOk);
        return new Car(producerList[x], colorList[y], carMileage, segmentList[z], isEngineOk, isSuspensionOk, isBodyOk, isGearboxOk, areBrakesOk, price);

    }

    public Customer generateCustomer() {
        Random random = new Random();
        int car1 = random.nextInt(9);
        int car2 = random.nextInt(9);
        while (car1 == car2) {
            car2 = random.nextInt(9);
        }
        int damage = generateDamageAcceptation();
        double cash = generateCustomerCash(damage);
        return new Customer(cash, damageAcceptationList[damage], producerList[car1], producerList[car2]);

    }


    public double generateCustomerCash(int damage) {
        Random random = new Random();
        if (damage == 0) {
            return random.nextInt(100000) + 150000;
        } else if (damage == 1) {
            return random.nextInt(100000) + 10000;
        } else {
            return random.nextInt(100000) + 50000;
        }
    }


    public int generateDamageAcceptation() {
        Random random = new Random();
        int prob = random.nextInt(100);
        if(prob > 85){
            return 1;
        } else if (prob>75) {
            return 2;
        }else {
            return 0;
        }
    }


    public int generateProducer() {
        Random random = new Random();
        return random.nextInt(9);
    }

    public int generateColor() {
        Random random = new Random();
        return random.nextInt(8);
    }


    public int generateSegment() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public boolean generatePartStatus() {
        Random random = new Random();
        int x = random.nextInt(2);
        return x == 1;
    }

    public double generatePrice(int z, boolean isEngineOk, boolean isSuspensionOk,
                                boolean isBodyOk, boolean isGearboxOk, boolean areBrakesOk) {
        double basePrice = 100000.0;
        double brokenPartsCost = 0.00;
        double price;
        if (z == 0) {
            price = basePrice * 0.5;
        } else if (z == 1) {
            price = basePrice;
        } else {
            price = basePrice * 2;
        }
        if (!isEngineOk) {
            brokenPartsCost += price * 0.4;
        }
        if (!isSuspensionOk) {
            brokenPartsCost += price * 0.08;
        }
        if (!isBodyOk) {
            brokenPartsCost += price * 0.20;
        }
        if (!isGearboxOk) {
            brokenPartsCost += price * 0.20;
        }
        if (!areBrakesOk) {
            brokenPartsCost += price * 0.04;
        }
        price = price - brokenPartsCost;
        return price;
    }

}
