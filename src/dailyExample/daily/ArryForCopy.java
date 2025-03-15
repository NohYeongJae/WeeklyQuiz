package dailyExample.daily;

public class ArryForCopy {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}};
        int[][] b = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "] = " + b[i][j]);
            }
        }
    }
}
