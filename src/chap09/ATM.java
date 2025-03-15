package chap09;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(30000);
        System.out.println("예금액: "+account.getBalance());

        try{
            account.withdraw(100000);
        } catch (BalancelnsufficientException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
