package assignment1.model.radiator;

public class OffState implements RadiatorState
{

    private static final int POWER = 0;
    @Override
    public void turnUp(Radiator radiator) {
        radiator.setPowerState(new Power1State());
        System.out.println("Radiator from 0 to 1");
    }

    @Override
    public void turnDown(Radiator radiator) {
        System.out.println("Radiator already OFF");
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
