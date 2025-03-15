package chap04;

public class switchCaseExample {
    public static void main(String[] args) {
        String day = args[0];

        switch (day) {
            case "월요일" -> System.out.println("Start of the work week");
            case "금요일" -> System.out.println("Almost weekend");
            case "화요일", "수요일", "목요일", "토요일", "일요일" -> System.out.println("Midweek");
            default -> System.out.println("Invalid value");
        }
    }
}
