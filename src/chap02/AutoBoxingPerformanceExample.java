package chap02;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long term = System.currentTimeMillis() - start;
        System.out.println(term+"ms");
    }
}
