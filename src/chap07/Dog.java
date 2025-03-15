package chap07;

public class Dog extends Animal {

    Dog(){
        System.out.println("Dog constructor");
    }
    Dog(String name){
        this.name = name;
    }

    void sleep(int hour){
        System.out.println(name+" sleeps "+hour+" hours");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("happy");
        dog.name = "happy";
        dog.sleep();
        dog.sleep(10);
    }
}
