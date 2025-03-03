import java.util.logging.Logger;

public class LoginLogger {
    private static final Logger logger = Logger.getLogger(LoginLogger.class.getName());

    public void logLogin(boolean loginSuccessful, String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}