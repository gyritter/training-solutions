package algorithmscount;

public class Transaction {

    private String accountNumer;
    private TransactionType transactionType;

    private long amount;

    public Transaction(String accountNumer, TransactionType transactionType, long amount) {
        this.accountNumer = accountNumer;
        this.transactionType = transactionType;
        this.amount = amount;
    }


    public String getAccountNumber() {
        return accountNumer;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isCredit(){
        return transactionType == TransactionType.CREDIT;
    }

    public boolean isDebit() {
        return transactionType == TransactionType.DEBIT;
    }

}



