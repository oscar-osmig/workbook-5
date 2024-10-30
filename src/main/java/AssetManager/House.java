package AssetManager;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition,
                 int squareFoot, int lotSize) {

        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }
    @Override
    public Double getValue(){
        double extraCents = 0.25;
        if(getCondition() == 1){
            return 180 * squareFoot + 0.25 * lotSize;
        }else if(getCondition() == 2){
            return 130 * squareFoot + 0.25 * lotSize;
        }else if(getCondition() == 3){
            return 90 * squareFoot + 0.25 * lotSize;
        }else if(getCondition() == 4){
            return 80 * squareFoot + 0.25 * lotSize;
        }else {
            return null;
        }
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
