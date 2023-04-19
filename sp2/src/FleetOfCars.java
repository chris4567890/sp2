import java.lang.annotation.Target;
import java.util.ArrayList;

public class FleetOfCars {

    private ArrayList<Car> fleet;

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    public FleetOfCars(){
        this.fleet = new ArrayList<Car>();
    }

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFooForFleet(){
        int totalRegistrationFee = 0;
        int i = 0;

        for (Car car : fleet){
            totalRegistrationFee += car.getRegistrationFee();
        }

        return totalRegistrationFee;
    }


    @Override
    public String toString(){
        String s ="Here is your fleet of cars: ";
        for(Car car : fleet){
             s += car.toString()+"\n";
        }
        return s;
    }


}
