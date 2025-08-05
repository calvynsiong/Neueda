public class DodgyNameException extends Exception {
    public DodgyNameException(String message) {
        super("Fingers is not allowed an account");
    }

    public DodgyNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public DodgyNameException(Throwable cause) {
        super(cause);
    }
}
