package chap07.abstrac;

public class SamsumPhone extends Phone{
    public SamsumPhone(String owner) {
        super(owner);
    }
    @Override
    public void turnOff(){
        System.out.println("Turning off SamsumPhone");
    }
    public static void main(String[] args){
        SamsumPhone samsumPhone = new SamsumPhone("SamsumPhone");
        samsumPhone.turnOn();
        samsumPhone.turnOff();
    }
}
