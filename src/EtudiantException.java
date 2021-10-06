import java.util.*;

/**
 * Exception qui survient lorsque un étudiant n'existe pas
 */
public class EtudiantException extends Exception {
    public EtudiantException() {
        super();
    }
    public EtudiantException(String message) {
        super(message);
    }
}