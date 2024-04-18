package visitorPattern;

import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    // HashMap to store text package details for each telco
    private static Map<String, String> unliCallTextOfferMap = new HashMap<>();

    static {
        unliCallTextOfferMap.put("Smart", "However, they do not offer any free calls or texts, and you will be charged per use.");
        unliCallTextOfferMap.put("Globe", "This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliCallTextOfferMap.put("Ditto", "This plan includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        // Get text package details from the HashMap and it will depend on the telcoName
        String offer = unliCallTextOfferMap.getOrDefault(telcoName, "Unknown");

        // Return the appropriate message based on the text package details and the boolean value
        if (unliCallText) {
            return "Unlimited calls and text package for " + telcoName + ". " + offer;
        } else {
            return "No unlimited calls and text package for " + telcoName + ". " + offer;
        }
    }
}