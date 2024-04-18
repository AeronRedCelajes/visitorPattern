class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price) {
        return "Total Cost for " + telcoName + ": ₱" + price;
    }

    @Override
    public String showAllowance(TelcoSubscription subscription) {
        if (subscription instanceof Telco) {
            Telco telco = (Telco) subscription;
            return "Total Cost for " + telco.getTelcoName() + ": ₱" + telco.getPromoPrice();
        }
        return "";
    }
}