package week07d05;

public class Vehicle {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public Vehicle() {
        this.numberOfGears = 5;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public Vehicle(TransmissionType transmissionType) {
        this.numberOfGears = 5;
        this.transmissionType = transmissionType;
    }

    public Vehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }


}
