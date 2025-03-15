package chap07;

public class Animal {
    String name;

    Animal() {
        System.out.println("Animal constructor");
    }

    public void sleep(){
        System.out.println(this.name + "Sleeping...");
    }
}
