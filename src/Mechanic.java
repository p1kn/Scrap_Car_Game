import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mechanic {
    static List<Mechanic> mechanicList = new ArrayList<>();
    private String name;
    private int costPerHour;
    private int probabilityOfFailure;
    private int probabilityOfDamage;



    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    public int getProbabilityOfDamage() {
        return probabilityOfDamage;
    }

    public void setProbabilityOfDamage(int probabilityOfDamage) {
        this.probabilityOfDamage = probabilityOfDamage;
    }

    public int getProbabilityOfFailure() {
        return probabilityOfFailure;
    }

    public void setProbabilityOfFailure(int probabilityOfFailure) {
        this.probabilityOfFailure = probabilityOfFailure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mechanic(String name, int costPerHour, int probabilityOfFailure, int probabilityOfDamage ) {
        this.name = name;
        this.costPerHour = costPerHour;
        this.probabilityOfFailure = probabilityOfFailure;
        this.probabilityOfDamage = probabilityOfDamage;

    }

    public static void addMechanic() {

        mechanicList.add(new Mechanic("Janusz", 100, 0, 0 ));
        mechanicList.add(new Mechanic("Marian", 75, 10, 0 ));
        mechanicList.add(new Mechanic("Adrian", 50, 20, 2 ));

    }

   public static void printMechanicList() {
       for (Mechanic mechanic : mechanicList) {
           String toString = mechanic.toString();
           System.out.println(toString);
       }
   }

    @Override
    public String toString() {
        return "Mechanik " + name +
                " ,koszt roboczogodziny = " + costPerHour + " zł" +
                " ,prawdopodobieństwo niepowodzenia naprawy = " +  probabilityOfFailure + " %" +
                " ,prawdopodobieństwo uszkodzenia innego elementu = " + probabilityOfDamage + " %";
    }
}
