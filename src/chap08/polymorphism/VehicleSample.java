package chap08.polymorphism;

public class VehicleSample {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();


        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);
    }
}


