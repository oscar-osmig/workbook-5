package AssetManager;

public class Cash extends Asset {
    private int cash;

    public Cash(String description, String dateAcquired, double originalCost, int cash) {
        super(description, dateAcquired, originalCost);
        this.cash = cash;
    }

    @Override
    public Double getValue() {
        return 0.0;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
