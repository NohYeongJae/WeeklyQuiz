package chap05;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" Java/Spring");
        buffer.append(" DBMS");
        System.out.println(buffer);

        buffer.insert(1, "Hello!");
        System.out.println(buffer);

        System.out.println(buffer.substring(10));
        StringBuffer reverse = buffer.reverse();
        System.out.println("reverse: " + reverse);

    }
}
