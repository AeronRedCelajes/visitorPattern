package visitorPattern;

interface UnliCallsTextOffer {
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText);
    public String showUnliCallsTextOffer(TelcoSubscription telco); 
}