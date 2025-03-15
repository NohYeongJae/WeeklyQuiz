package chap07.abstrac;

public abstract class Phone {
    private String owner;

    public Phone(String owner) {
        this.owner = owner;
    }
    public void turnOn(){
        System.out.println("Turning on ");
    }
    abstract public void turnOff();

}
