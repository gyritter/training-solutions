package exceptionmulticatch;

public class InvalidBinaryStringException extends RuntimeException {
    public InvalidBinaryStringException(RuntimeException ex) {
    }
}
