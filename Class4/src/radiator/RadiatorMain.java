package radiator;

public class RadiatorMain {
    public static void main(String[] args) throws InterruptedException {
        Radiator radiator = new Radiator();

        System.out.println(radiator.getPower());
        radiator.turnUp();
        System.out.println(radiator.getPower());
        radiator.turnDown();
        System.out.println(radiator.getPower());
        radiator.turnUp();
        System.out.println(radiator.getPower());
        radiator.turnUp();
        System.out.println(radiator.getPower());
        radiator.turnUp();
        System.out.println(radiator.getPower());
        Thread.sleep(5500);
        System.out.println(radiator.getPower());



    }
}
