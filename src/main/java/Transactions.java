public enum Transactions {
    RENT(0.05),
    SELL(1.0);

    private final Double rate;

    Transactions(Double rate){
        this.rate = rate;
    }

    public Double getRate(){
        return this.rate;
    }
}


