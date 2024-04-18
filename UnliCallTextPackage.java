class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return "Unlimited calls and text package for " + telcoName;
        } else {
            return "No unlimited calls and text package for " + telcoName;
        }
    }

    @Override
    public String showUnliCallsTextOffer(TelcoSubscription subscription) {
        if (subscription instanceof Telco) {
            Telco telco = (Telco) subscription;
            if (telco.hasUnliCallText()) {
                return "Unlimited calls and text package for " + telco.getTelcoName();
            } else {
                return "No unlimited calls and text package for " + telco.getTelcoName();
            }
        }
        return "";
    }
}