import java.util.logging.Logger;
import java.util.regex.Pattern;

public class LoginLogger {
    private static final Logger logger = Logger.getLogger(LoginLogger.class.getName());

    public void logLogin(boolean loginSuccessful, String username) {
        String sanitizedUsername = sanitizeUser(username);
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizedUsername);
        } else {
            logger.severe("User login failed for: " + sanitizedUsername);
        }
    }

    private String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
    }
}