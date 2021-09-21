package Telephone;

public class MainTelephone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.receiveCall();
        phone.receiveMessage("Hello message");
        phone.turnVolumeUp();
        phone.turnVolumeUp();
        phone.turnVolumeUp();
        phone.turnVolumeUp();
        phone.goToVibrate();    phone.receiveCall();    phone.receiveMessage("Hello message2");
        phone.goToSilent();    phone.receiveCall();    phone.receiveMessage("Hello message3");}
}
