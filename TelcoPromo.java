public class TelcoPromo {
    public static void main(String[] args) {
      TelcoSubscription smart = new Telco(15, 500, "Smart",false);
      TelcoSubscription globe = new Telco(10, 450, "Globe",true);
      TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);
  
      UsagePromo promo = new TelcoAllowance();
      UnliCallOffer unli = new UnliCallTextPackage();    
  
      System.out.println("Smart Total Cost: ₱" + promo.showAllowance(smart));
      System.out.println("Globe Total Cost: ₱" + promo.showAllowance(globe));
      System.out.println("Telco C Total Cost: ₱" + promo.showAllowance(ditto));
  
      System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
      System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
      System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
    }
  }