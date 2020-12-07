package defaultconstructor;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if(!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        boolean decision = true;
        if (year < 1900) decision = false;
        if (decision) {
            if (month < 1 || month > 12) decision = false;
        }
        if (decision) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day < 1 || day > 31) decision = false;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 || day > 30) decision = false;
                    break;
                case 2:
                    int d = 28;
                    boolean y = isLeapYear(year);
                    if (y) d = 29;
                if (day < 1 || day > d) decision = false;
                break;
            }
        }
        return decision;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
