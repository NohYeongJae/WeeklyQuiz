package chap07.abstrac;

public abstract class Animal {
    String kind;

    public void breath() {
        System.out.println("후욱후욱");
    }

    public abstract void sound();

}
