package Telephone;

public class SilentState implements PhoneState{
    @Override
    public void onReceiveMessage(String txt, Phone phone) {
        System.out.println(txt);
    }

    @Override
    public void onReceiveCall(Phone phone) {
        System.out.println("Somebody is calling, but I am muted.");
    }

    @Override
    public void onVolumeButtonUp(Phone phone) {
        phone.setState(new VibrateState());
    }

    @Override
    public void onVolumeButtonDown(Phone phone) {
        System.out.println("Phone is already silent.");
    }
}
