package chap04;

public class score {
    public static void main(String[] args) {

        int score =Integer.parseInt(args[0]);

        if (score >= 90) {
            System.out.println("등급은 A입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("등급은 B입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("등급은 D입니다.");
        }
    }
}
