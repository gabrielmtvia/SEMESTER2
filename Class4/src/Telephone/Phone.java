package Telephone;

public class Phone {
    private PhoneState currentState=new SoundState();
    private int currentVolume;

    public Phone(){
        currentVolume = 100;
    }

    public void receiveMessage(String txt){
        currentState.onReceiveMessage(txt,this);
    }

    public void receiveCall(){
        currentState.onReceiveCall(this);
    }

    public void volumeUpButton(){
        currentState.onVolumeButtonUp(this);
    }

    public void volumeButtonDown(){
        currentState.onVolumeButtonDown(this);
    }

    public void goToSilent(){
        currentState = new SilentState();
    }

    public void goToVibrate(){
        currentState = new VibrateState();
    }

    public void goToSound(){
        currentState = new SoundState();
    }

    int getVolume(){
        return currentVolume;
    }

    void turnVolumeUp(){
        currentVolume++;
    }

    void turnVolumeDown(){
        currentVolume --;
    }

    void playRingTone(){
        System.out.println("Ringeling Ringeling");
    }
    void vibrate(){
        System.out.println("Brrrrrrr Brrrrrrrr");
    }

    void beepBeep(){
        System.out.println("Beep Beep");
    }

    void setState(PhoneState state){
        currentState = state;
    }

}
