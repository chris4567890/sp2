public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {

        if(getKmPrLitre() <5){
            return 10470;
        } else if (getKmPrLitre() >=5 && getKmPrLitre() <10) {
            return 5500;
        } else if (getKmPrLitre() >=10 && getKmPrLitre() <15) {
            return 2340;
        } else if (getKmPrLitre() >=15 && getKmPrLitre() < 20) {
            return 1050;
        } else if (getKmPrLitre() >=20 && getKmPrLitre() < 50) {
            return 330;
        }

        else{
            return 0;
        }
    }

}
