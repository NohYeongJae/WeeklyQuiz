package chap06;

public class Calculator {

    int result;

    void postfixOperator(Calculator cal) {
        cal.result++;
    }

    public static void main(String[] args) {
        Calculator sample = new Calculator();

        sample.result = 1;
        sample.postfixOperator(new Calculator());
        System.out.println(sample.result);

    }
}
