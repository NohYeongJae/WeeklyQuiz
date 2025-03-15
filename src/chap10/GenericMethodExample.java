package chap10;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("문자하나");
        System.out.println(result.get());
    }
}
