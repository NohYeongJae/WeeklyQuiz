package chap09;

public class BalanceExceptionSample {
    public static void main(String[] args) {

        try{
            throw new BalancelnsufficientException("잔금부족, 잔액: "+1000);
        } catch (BalancelnsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
