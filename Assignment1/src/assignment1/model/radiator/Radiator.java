package assignment1.model.radiator;

public class Radiator {
    private RadiatorState currentState = new OffState();

    public Radiator(){}

    public void turnUp(){
        currentState.turnUp(this);
    }

    public void turnDown(){
        currentState.turnDown(this);
    }

    public int getPower(){
        return currentState.getPower();
    }

    void setPowerState(RadiatorState state)
    {
        currentState = state;
    }
}
