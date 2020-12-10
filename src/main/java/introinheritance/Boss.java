package introinheritance;

public class Boss extends Employee{

    private final double LEADERSHIP_FACTROR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary(){
        return super.getSalary()*LEADERSHIP_FACTROR*this.numberOfEmployees+super.getSalary();
    }
}
