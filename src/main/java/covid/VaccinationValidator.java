package covid;

public class VaccinationValidator {

    public static boolean stringValidator(String input) {
        if (input == null || input.isEmpty() || input.isBlank()) {
            return false;
        }
        return true;
    }

    public static boolean emailValidator(String input) {
        if (stringValidator(input)) {
            if (input.length() > 3 && input.substring(1).contains("@")) {
                return true;
            }
        }
        return false;
    }

    public static  boolean ageValidator(long input) {
        if (input > 10 && input < 150) {
            return true;
        }
        return false;
    }

    public static boolean cDVValidator(String taj) {

        if (taj.length() != 9) return false;

        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (taj.charAt(i) - '0') * ((i % 2) * 4 + 3);
        }
        if ((sum % 10) == taj.charAt(8) - '0') {
            return true;
        }
        return false;
    }
}
