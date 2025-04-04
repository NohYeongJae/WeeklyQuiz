package chap07.constructor;

    /*1. 매개변수가 없은(default) 생성자 호출
      2. 부모 클래스에 매개변수가 있는 생성자 생성 -> 오류발생
        -> 더이상 호출할 부모의 default 생성자가 사라짐 super();
      3. 자식 클래스의 생성자에서, 부모클래스의 생성자를 호출하도록 바꿔주면 됨
    */

public class SportsCar extends Car {
    int zero100;

    SportsCar(String name, int zero100) {
        super(name);
        this.zero100 = zero100;
    }

    public static void main(String[] args){
        SportsCar sportscar = new SportsCar("sports car", 5); //1. 매개변수가 없은(default) 생성자 호출
    }
}
