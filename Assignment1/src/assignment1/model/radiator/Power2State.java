package assignment1.model.radiator;

public class Power2State implements RadiatorState{

    private static final int POWER = 2;

    @Override
    public void turnUp(Radiator radiator) {
        System.out.println("Radiator now in power 3");
        radiator.setPowerState(new Power3State(radiator));

    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new Power1State());
        System.out.println("Radiator now in power 1");
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
