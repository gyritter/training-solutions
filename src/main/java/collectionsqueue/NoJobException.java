package collectionsqueue;

public class NoJobException extends RuntimeException{
    private String message;

    public NoJobException(String message) {
        super(message);
    }
}
