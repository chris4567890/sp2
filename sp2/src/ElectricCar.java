public class ElectricCar extends ACar{

    private int batterCapacity,maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,int batterCapacity,int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batterCapacity = batterCapacity;
        this.maxRange = maxRange;
    }

    public int getBatterCapacity(){
        return batterCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    int getWhPrKm(){
        return batterCapacity *1000 / maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPl = (int) (100/(getWhPrKm()/91.25));

        return kmPl;
    }

    @Override
    public String toString(){
        return "The batterCapacity in KWh : " + getBatterCapacity()+ "it's max range in km: " + getMaxRangeKm()+ " it's watt per km/h: "+getWhPrKm();
    }

}
