package chap09;

public class DivideExceptionSample {
    public static void printByeMessage() {
        System.out.println("Bye!");
    }

    public static void main(String[] args) {

        int inputValue = Integer.parseInt(args[0]);
        int result = 0;
        try{
            result = 5 / inputValue;
            printByeMessage();
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("Arithmetic Exception"+e.getMessage());
        } finally {
            System.out.println("result: "+result);
            printByeMessage();
        }
    }
}
