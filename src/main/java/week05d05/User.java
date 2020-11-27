package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {

        int kukac =kukac(email);
        int pont = pont(email.substring(kukac+2));
        if (kukac >0 && pont >0){
        this.email = email;} else throw new IllegalArgumentException("The e-mail address invalid!");

        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int kukac(String text){
        int kukac = text.indexOf("@");
        return kukac;
    }

    private int pont(String text){
        int pont = text.lastIndexOf(".");
        return pont;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
