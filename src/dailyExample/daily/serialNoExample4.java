package dailyExample.daily;

public class serialNoExample4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 20;
        int z = 300;

        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
