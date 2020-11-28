package week05d04;

import java.time.LocalDate;

public class Product2 {
    private String name;
    private LocalDate expiryDate;

    public Product2(String name, int year, int month, int day) {
        this.name = name;
        expiryDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
//a boolean isExpired-et inkább itt a Product2 osztályban hozta létre

    public Boolean isExpired(){

        if (expiryDate.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }
}
