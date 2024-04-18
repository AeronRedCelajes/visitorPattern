package visitorPattern;

import java.util.*;

class TelcoAllowance implements UsagePromo {

    private static final Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return "Total Cost for " + telcoName + ": ₱" + money;
    }
    /*
    @Override
    public String showAllowance(TelcoSubscription telco) {
        return this.showAllowance(telco.getTelcoName(), telco.getPromoPrice());
    }
    */

}
