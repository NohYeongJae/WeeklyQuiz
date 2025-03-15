package chap08.zoo;

public interface Predator {

    String getFood();

    class Tiger implements Predator {
        @Override
        public String getFood(){
            return "meat";
        }
    }
    class Lion implements Predator {
        @Override
        public String getFood(){
            return "fish";
        }
    }

}
