package chap06;

public class MethodSample {

    int postfixOperation(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        MethodSample ms = new MethodSample();
        int result = ms.postfixOperation(a);
        System.out.println(result);
    }
}
