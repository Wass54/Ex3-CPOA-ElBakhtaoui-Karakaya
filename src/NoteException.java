import java.util.*;

/**
 * Exception qui survient lorsque la note n'est pas dans la bonne intervalle
 */
public class NoteException extends Exception {
    public NoteException() {
        super();
    }
    public NoteException(String message) {
        super(message);
    }
}