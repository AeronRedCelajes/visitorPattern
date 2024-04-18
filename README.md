## Problem Scenario

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

Smart: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.
Globe: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
Ditto: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.
Implement the visitor design pattern based from the given diagram. Refer to this link.  

Test your codes before the given client program:

```
public class visitorPattern.TelcoPromo {
  public static void main(String[] args) {
    visitorPattern.TelcoSubscription smart = new visitorPattern.Telco(15, 500, Smart,false);
    visitorPattern.TelcoSubscription globe = new visitorPattern.Telco(10, 450, Globe,true);
    visitorPattern.TelcoSubscription ditto = new visitorPattern.Telco(8, 400, Ditto,true);

    visitorPattern.UsagePromo promo = new visitorPattern.TelcoAllowance();
    UnliCallOffer unli = new visitorPattern.UnliCallTextPackage();    

    System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart) );
    System.out.println("Globe Data Usage Offer and price" + promo.showAllowance(globe));
    System.out.println("Ditto Data Usage Offer and price" + promo.showAllowance(ditto));

    System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
    System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
    System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
  }
}
```

## Class Diagram
![UML Visitor Pattern](https://github.com/AeronRedCelajes/visitorPattern/assets/142370807/aed94ac1-0f77-4bb8-b0cd-5c0f4762e1db)
