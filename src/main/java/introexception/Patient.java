package introexception;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name should be filled with valid data");
        }
        if (yearOfBirth <= 1900) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber))
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
