package chap07.override;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 3;

        Calcurator calcurator = new Calcurator();
        System.out.println("원면적: "+calcurator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적: "+computer.areaCircle(r));
    }
}
