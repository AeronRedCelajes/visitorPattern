interface TelcoSubscription {
    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallOffer unliCallOffer, boolean unliCallText);
}