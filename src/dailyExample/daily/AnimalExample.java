package dailyExample.daily;

public class AnimalExample {

    private String animalName;
    private int sleep;

    void setName (String name) {
        this.animalName = name;
    }

    public String getName () {
        return animalName;
    }
    void setSleep (int sleep) {
        this.sleep = sleep;
    }
    public int sleep(){
        return sleep;
    }

    public static void main(String[] args) {
        AnimalExample animalExample = new AnimalExample();
        animalExample.setName ("Dog");
        animalExample.setSleep(12);
        System.out.println(animalExample.animalName+"은 하루에"+animalExample.sleep()+"이상 잡니다.");
    }
}
