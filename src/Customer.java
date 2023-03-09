import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
   public double customerCash;
   public String damageAcceptation;
   public String preferredBrand1;
   public String preferredBrand2;

   public Customer(double customerCash, String damageAcceptation, String preferredBrand1, String preferredBrand2) {
      this.customerCash = customerCash;
      this.damageAcceptation = damageAcceptation;
      this.preferredBrand1 = preferredBrand1;
      this.preferredBrand2 = preferredBrand2;
   }

   @Override
   public String toString() {
      return "Klient posiada: " + customerCash + "zł" + "\n" +
              "   akceptuje: " + damageAcceptation + "\n" +
              "   preferowane marki: " + preferredBrand1 + " oraz " + preferredBrand2;

   }
}
