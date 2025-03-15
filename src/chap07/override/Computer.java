package chap07.override;

public class Computer extends Calcurator {
    @Override
    double areaCircle(double radius){
        System.out.println("Area of computer");
        return Math.PI * radius * radius;
    }
}
