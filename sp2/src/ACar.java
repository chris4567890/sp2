public abstract class ACar implements Car {

    private String registrationNumber,make,model;
    private int numberOfDoors;

    public ACar(String registrationNumber,String make,String model,int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setNumberOfDoors(int num){
        this.numberOfDoors = num;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString(){
        return "This is the registration number: "+registrationNumber+" this is the model: "+model+" maker: "+make + " number of doors: "+getNumberOfDoors();
    }

}
