package visitorPattern;

import java.util.*;

public class TelcoAllowance implements UsagePromo {

    // HashMap to store data allowances for each telco
    private static final Map<String, Double> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15.0);
        allowanceMap.put("Globe", 10.0);
        allowanceMap.put("Ditto", 8.0);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        // Get data allowance from the HashMap and it will depend on the telcoName
        double allowance = allowanceMap.getOrDefault(telcoName, 0.0);
        return telcoName + " offers a data allowance of " + allowance + " GB for ₱" + money + " per month.";
    }
}