package algorithmssum;

import java.util.List;

public class TransactionsSUmCalculator {

        public int sumAmountOfCreditEntries(List<Transaction> transactions){
            int sumCredit=0;
            for (Transaction credit: transactions){
                if (credit.isCredit())
                 sumCredit+=credit.getAmount();

            }
            return sumCredit;
        }

    }


