package visitorPattern;

import java.util.*;

class UnliCallTextPackage implements UnliCallsTextOffer {

    private static Map<String, String> unliCallTextOfferMap = new HashMap<>();

    static {
        unliCallTextOfferMap.put("Smart", "False");
        unliCallTextOfferMap.put("Globe", "True");
        unliCallTextOfferMap.put("Ditto", "True");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls and text package for " + telcoName;
        } else {
            return "Unlimited calls and text package for " + telcoName;
        }

    }

    /*
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription telco) {
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.getUnliCallText());
    }
    */

}
