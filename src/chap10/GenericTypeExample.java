package chap10;

public class GenericTypeExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set(100);

        int value = (int) box.get();
        System.out.println("Generic Type 사용하지 않은경우."+value);

        Box<String> box2 = new Box<>();
        box2.set("Hello");
        String str = box2.get();
        System.out.println("Generic Type 사용. value: "+ str);
    }
}
