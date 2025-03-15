package chap04;

public class ReverseNumberExample {
    public static void main(String[] args) {
        String num = args[0];

        for (int i = num.length() - 1; i >= 0; i--) {
            System.out.print(num.charAt(i));
        }
    }
}
