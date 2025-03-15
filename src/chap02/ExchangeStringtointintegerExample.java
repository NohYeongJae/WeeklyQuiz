package chap02;

public class ExchangeStringtointintegerExample {
    public static void main(String[] args) {
        /*String -> int*/
       /* String str = "12345";
        int intValue = Integer.parseInt(str);
        Integer integerValue = Integer.valueOf(str);

        System.out.println(intValue);
        System.out.println(integerValue);*/

        /*String -> Long/Long*/

        /*String str = "10000000000";
        long strLong = Long.parseLong(str);
        Long strLongLong = Long.valueOf(strLong);
        System.out.println(strLongLong);*/

        //String -> double
        /*String str = "1000.123";

        double d = Double.parseDouble(str);
        Double d2 = Double.valueOf(str);
        System.out.println(d2);*/
/*
        int intValue = 10;
        String StrValue;

        StrValue = String.valueOf(intValue);
        StrValue = Integer.toString(intValue);
        StrValue = "asdad" + intValue;
        System.out.println(StrValue);*/

        long num = 3456;
        String convert1 = Long.toString(num);
        String convert2 = String.valueOf(num);
        String convert3 = num + "";
        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
    }
}
