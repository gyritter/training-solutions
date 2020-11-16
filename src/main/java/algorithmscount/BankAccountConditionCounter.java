package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countLarger(List<BankAccount> accounts, int minBalance ) {
        int count = 0;
        for (BankAccount account: accounts) {
            if (account.getBalance() > minBalance) {
                count++;
            }
        }
        return count;
    }
}
