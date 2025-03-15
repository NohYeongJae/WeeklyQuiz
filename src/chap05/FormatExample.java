package chap05;

public class FormatExample {
    public static void main(String[] args) {
        String name1 ="Tim";
        int age1 =10;
        String name2 ="Anna";
        int age2 =20;

        String str = String.format("%s의 나이는 %s세 입니다.", name1, age1);
        System.out.println(str);
    }
}
