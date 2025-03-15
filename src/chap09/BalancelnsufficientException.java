package chap09;

public class BalancelnsufficientException extends Exception {
    public BalancelnsufficientException() {

    }
    public BalancelnsufficientException(String errorMessage) {
        super(errorMessage);
    }
}
