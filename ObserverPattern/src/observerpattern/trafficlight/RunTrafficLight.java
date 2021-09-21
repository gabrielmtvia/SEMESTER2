package observerpattern.trafficlight;

public class RunTrafficLight {
    public static void main(String[] args) throws InterruptedException{
        TrafficLight trafficLight = new TrafficLight();
        Car1 car1 = new Car1();
        trafficLight.addPropertyChangeListener(car1);
        trafficLight.start();
    }
}
