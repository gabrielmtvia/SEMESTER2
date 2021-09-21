package radiator;

public class Power3State implements RadiatorState {

    private static final int POWER = 3;
    private final Thread t;

    public Power3State(Radiator radiator) {

        System.out.println("Starts waiting");
        t = new Thread(() -> {
            System.out.println("Thread started");
            try {
                Thread.sleep(5000);
                System.out.println("Radiator going to level 2");
                radiator.setPowerState(new Power2State());
                System.out.println(radiator.getPower());

            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            System.out.println(radiator.getPower());
        });

        t.start();


    }


    @Override
    public void turnUp(Radiator radiator) {

    }

    @Override
    public void turnDown(Radiator radiator) {
        t.interrupt();
        radiator.setPowerState(new Power2State());
        System.out.println("Radiator now in power 2");

    }

    @Override
    public int getPower() {
        return POWER;
    }

}


