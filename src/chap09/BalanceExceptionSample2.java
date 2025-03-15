package chap09;

public class BalanceExceptionSample2 {
    public static void main(String[] args) throws BalancelnsufficientException {
        throwMethod();
    }
    public static void throwMethod() throws BalancelnsufficientException {
        throw new BalancelnsufficientException("잔금부족, 잔액: "+1000);
    }
}
