package stringtype.Registration;

public class UserValidator {
    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8
                && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int kukac = email.indexOf('@');
        String domain = email.substring(kukac + 1);
        int dotIndex = domain.indexOf('.');
        return kukac > 0
                && dotIndex > 0
                && dotIndex < domain.length() - 1;
    }
}

