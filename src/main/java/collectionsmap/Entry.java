package collectionsmap;

import java.time.LocalDate;

public class Entry {

    private String ipAddress;
    private String login;
    private LocalDate entryDate;

    public Entry(String ip_address, String login, LocalDate entryDate) {
        this.ipAddress = ip_address;
        this.login = login;
        this.entryDate = entryDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }
}
