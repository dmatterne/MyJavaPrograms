package be.david.fatchocobo;

/**
 * Repository Exception extens RuntimeException.
 */
public class RepositoryException extends RuntimeException {

    /**
     * This is a javadoc.
     * @param message
     */
    public RepositoryException(String message) {
        super(message);
    }

    /**
     * This is a javadoc.
     * @param message
     * @param cause
     */
    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
