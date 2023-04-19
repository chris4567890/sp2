public class DieselCar extends AFuelCar{

    boolean particleFilter;
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean getParticleFilter(){
        return particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        if(getKmPrLitre() <5){
            return 10470+15270;
        } else if (getKmPrLitre() >=5 && getKmPrLitre() <10) {
            return 5500+2770;
        } else if (getKmPrLitre() <=10 && getKmPrLitre() <15) {
            return 2340+2770;
        } else if (getKmPrLitre() >=15 && getKmPrLitre() < 20) {
            return 1050+1390;
        } else if (getKmPrLitre() >=20 && getKmPrLitre() < 50) {
            return 330+130;
        } else if (getKmPrLitre() <5 && getParticleFilter()) {
            return 10470+15270+1000;
        } else if (getKmPrLitre() >=5 && getKmPrLitre() <10 && getParticleFilter()){
            return 5500+2770+1000;
        } else if (getKmPrLitre() >=10 && getKmPrLitre() < 15 && getParticleFilter()) {
            return 2340+2770+1000;
        } else if (getKmPrLitre() >=15 && getKmPrLitre() < 20 && getParticleFilter()) {
            return 1050+1390+1000;
        } else if (getKmPrLitre() >=20 && getKmPrLitre() < 50 && getParticleFilter()) {
            return 330+130+1000;
        } else{
            return 0;
        }
    }
}
