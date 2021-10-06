import java.util.*;

/**
 * Exception qui survient lorsque une formation n'est pas compatible avec le groupe
 */
public class FormationNonCompatibleException extends Exception {
    public FormationNonCompatibleException() {
        super();
    }
    public FormationNonCompatibleException(String message) {
        super(message);
    }
}