package radiator;

public class Power1State implements RadiatorState{

    private static final int POWER = 1;

    @Override
    public void turnUp(Radiator radiator) {
        radiator.setPowerState(new Power2State());
        System.out.println("Radiator in power 2");
    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new OffState());
        System.out.println("Radiator turned off");
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
