package inheritanceconstructor;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel){
        double resid = super.getFuel()+this.extraFuel +fuel;
        if(resid>super.getTankCapacity()){
            super.setFuel(super.getTankCapacity());
            this.extraFuel = resid - super.getTankCapacity();
        } else {
            this.extraFuel = 0;
            super.setFuel(resid);
        }
    }
    @Override
    public void drive(int km){
        double resid = this.extraFuel+super.getFuel()-super.getFuelRate()*km/100;
        if (resid>0){
            if(resid>super.getTankCapacity()){
                this.extraFuel = resid-super.getTankCapacity();
                super.setFuel(super.getTankCapacity());
            } else {
                super.setFuel(resid);
                this.extraFuel = 0;
            }
        } else throw new RuntimeException("Not enough fuel available!");
    }

    @Override
    public double calculateRefillAmount(){
        return super.getTankCapacity()+this.extraCapacity-super.getFuel()-this.extraFuel;
    }
}
