package week07d02;

public interface User {

    public String getUsername();

    public String getFirstName();

    public String getLastName();

    public default String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    static User of(String username, String firstName, String lastName) {
        return new UserImpl(username,firstName, lastName);

    }
}