public class Main {
    public static void main(String[] args) {
        Car dieselCar1 = new DieselCar("0001","Opel Astra", "d122+5d edition",4,25,false);

        Car gasolinCar1 = new GasolinCar("0002","Alfa Romeo","t280 first edition",4,14);

        Car ElectricCar1 = new ElectricCar("0003","Aiway","Aiway 5",4,63,410);

        System.out.println(dieselCar1.getRegistrationFee());
        System.out.println(gasolinCar1.getRegistrationFee());
        System.out.println(ElectricCar1.getRegistrationFee());
        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(dieselCar1);
        fleet.addCar(gasolinCar1);
        fleet.addCar(ElectricCar1);


        System.out.println(fleet.toString());
        System.out.println("Total cost: in bsd: "+fleet.getTotalRegistrationFooForFleet());



    }
}