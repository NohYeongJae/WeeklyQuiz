package chap08.zoo;

public class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Predator.Tiger tiger = new Predator.Tiger();
        zooKeeper.feed(tiger);

        Predator.Lion lion = new Predator.Lion();
        zooKeeper.feed(lion);
    }
}
