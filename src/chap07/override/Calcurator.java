package chap07.override;

public class Calcurator {
    private static final double PI = 3.14;

    double areaCircle(double radius) {
        System.out.println("Calcurator area circle with radius");
        return PI * radius * radius;
    }
}
