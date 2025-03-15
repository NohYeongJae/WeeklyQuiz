package chap03;

public class OperatorExample {
    public static void main(String[] args) {
        int score =Integer.parseInt(args[0]);
        char grade = (score>90)? 'A' : ((score>80)?'B' : 'C');

        System.out.println(grade);
    }

}
