package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountnumber, String owner, int balance) {
        this.accountNumber = accountnumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int betet) {
        balance = balance + betet;
    }
    public void withdraw(int kivet) {
        balance= balance - kivet;
    }

    public String getOwner() {
        return owner;
    }

    public void transfer(BankAccount to, int osszeg) {
        withdraw(osszeg);
        to.deposit(osszeg);
    }

    public String getInfo() {
        return owner + " (" + accountNumber + ") : " + balance + " Ft";
    }
}
