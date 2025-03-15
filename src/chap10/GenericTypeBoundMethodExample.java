package chap10;

public class GenericTypeBoundMethodExample {
    public static void main(String[] args) {
        int result = Util.compare(4,5);
        System.out.println("result: "+result);

        int result2 = Util.compare(3.5,3.5);
        System.out.println("result2: "+result2);
    }
}
