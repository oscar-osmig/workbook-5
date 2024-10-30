package AssetManager;

public class VehicleTwo extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public VehicleTwo(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public Double getValue() {


        if ( this.odometer >=0 && this.odometer < 100000 ) {
            int currentYear = 2024;
            if (currentYear - this.year > 10){
                return (getOriginalCost() - 1000);
            }
            if (currentYear - this.year >= 0 & currentYear - getYear() <= 3){
                return getOriginalCost() - (getOriginalCost() * 0.03);
            }
            else if ( currentYear - this.year >=4 & currentYear - this.year <= 6){
                return getOriginalCost() - (getOriginalCost() * 0.06);
            }
            else if ( currentYear - this.year >=7 & currentYear - this.year <= 10){
                return   getOriginalCost() - (getOriginalCost() * 0.08);
            }

            else {
                return 0.0;
            }

        } else if (this.odometer > 100000 && !getMakeModel().toLowerCase().startsWith("toyota")
                && !getMakeModel().toLowerCase().startsWith("honda")) {
            return getOriginalCost() * 1.25;
        }else {
            return 0.0;
        }
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
