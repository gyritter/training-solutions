package week14d04;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {
    public Contracts template;

    public Contracts getTemplate() {
        return template;
    }

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contracts(client, monthlyPrices);

    }

    public Contracts createContract(String name) {
        return new Contracts(name, new ArrayList<>(template.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("John", List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
        Contracts rose = cc.createContract("Rózsi");
        rose.getMonthlyPrices().set(11, 20);

        System.out.println(rose.getMonthlyPrices());
        System.out.println(cc.getTemplate().getMonthlyPrices());

        Contracts joseph = cc.createContract("Jóska");
        System.out.println(joseph.getMonthlyPrices());
        System.out.println(cc.getTemplate().getMonthlyPrices());
        System.out.println(rose.getMonthlyPrices());

    }
}
