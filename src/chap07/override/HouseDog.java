package chap07.override;

public class HouseDog extends Dog {
    void sleep(int hour){
        System.out.println(this.name+" sleeps "+hour+" hours");
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("뽀삐");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
