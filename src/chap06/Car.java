package chap06;

public class Car {
    String company;
    String model;
    int maxSpeed;

    //1번 생성자
    Car(String company) {
        this.company = company;
    }

    //2번 생성자
    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    //3번 생성자
    Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public static void main(String[] args) {
        Car sonata = new Car("현대");                 // 1번 생성자 이용
        Car sportage = new Car("기아", "sportage");   // 2번 생성자 이용
        Car gv80 = new Car("제네시스", "gv80", 300);   // 3번 생성자 이용
    }
}
