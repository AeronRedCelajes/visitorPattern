package visitorPattern;

import java.util.*;

class UnliCallTextPackage implements UnliCallOffer {

    private static Map<String, String> unliCallOfferMap = new HashMap<>();

    static {
        unliCallOfferMap.put("Smart", "False");
        unliCallOfferMap.put("Globe", "True");
        unliCallOfferMap.put("Ditto", "True");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "No unlimited calls and text package for " + telcoName;
        } else {
            return "Unlimited calls and text package for " + telcoName;
        }

    }

    public String showUnliCallsTextOffer(TelcoSubscription telco) {
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.hasUnliCallText());
    }
}
