package dailyExample.daily;

public class ArrayMaxAverageExample {
    public static void main(String[] args) {
        int[] array = {12, 4, 7, 20, 1};
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];
        }
        double avg = sum / array.length;
        System.out.println(max);
        System.out.println(sum);
    }
}
