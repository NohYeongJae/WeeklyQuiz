package chap07.abstrac;

public class Bird extends Animal {
    public Bird() {
        this.kind = "조류";
    }
    @Override
    public void sound(){
        System.out.println("짹짹");
    }
}
