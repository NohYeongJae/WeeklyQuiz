package chap10;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        // 제네릭을 사용하지 않고 List 객체 생성
        /*List list = new ArrayList();
        list.add("문자열");
        list.add(new Account(10000));

        String str = (String) list.get(0);
        System.out.println(str);*/
        //String account = (String) list.get(1);

        // 제네릭을 사용해서 List 객체를 생성
        List<String> list2 = new ArrayList<>();
        list2.add("문자열");
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}
