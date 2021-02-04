package week14d04;

import java.util.List;

public class Contracts {

    private String client;
    private List<Integer> monthlyPrices;

    public Contracts(String client, List<Integer> monthlyPrices) {
        this.client = client;
        this.monthlyPrices = monthlyPrices;
    }

    public Contracts() {
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }
}
