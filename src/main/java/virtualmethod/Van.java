package virtualmethod;

public class Van extends Car{

    private int cargoWeight;

    public Van(int numberPassenger,int vehicleWeight,  int cargoWeight) {
        super(vehicleWeight, numberPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    public String toString(){
        return "Van{cargoWeight="+cargoWeight+", numberOfPassenger="+getNumberPassenger() +", vehicleWeight="+getVehicleWeight()+"}";

    }

    public int getCargoWeight() {
        return cargoWeight;
    }
}
