import java.util.*;

/**
 * Exception qui survient lorsque la matière n'existe pas
 */
public class MatiereException extends Exception {
    public MatiereException() {
        super();
    }
    public MatiereException(String message) {
        super(message);
    }
}