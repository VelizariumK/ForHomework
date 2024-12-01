
public class RegistrationCheck {

    public static boolean checkRegistration(String login, String password, String confirmPassword) {
        try {
            //Login validation
            if (login == null || login.length() >= 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Invalid login: Login must contain only letters, numbers, and underscores, and be less than 20 characters.");
            }

            //Password validation
            if (password == null || password.length() >= 20 || !password.matches("^[a-zA-Z0-9_]+$") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Invalid password: Password must contain only letters, numbers, and underscores, be less than 20 characters, and match the confirmation password.");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
}