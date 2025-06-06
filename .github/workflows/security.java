import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "password123";

        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available.");
            return;
        }

        for (int i = 0; i < 3; i++) {
            String username = console.readLine("Enter Username: ");
            char[] passwordArray = console.readPassword("Enter Password: ");
            String password = new String(passwordArray);

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful.");
                return;
            } else {
                System.out.println("Invalid credentials. Try again.");
            }
        }

        System.out.println("Too many failed attempts. Exiting...");
    }
}
