package trafficlight;

public class MainTraffic {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        Pedestrian pedestrian1 = new Pedestrian(4);
        Pedestrian pedestrian2 = new Pedestrian(5);
        Pedestrian pedestrian3 = new Pedestrian(6);
        Taxi taxi1 = new Taxi(7);
        Taxi taxi2 = new Taxi(8);

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.addUser(car1);
        trafficLight.addUser(car2);
        trafficLight.addUser(car3);
        trafficLight.addUser(pedestrian1);
        trafficLight.addUser(pedestrian2);
        trafficLight.addUser(pedestrian3);
        trafficLight.addUser(taxi1);
        trafficLight.addUser(taxi2);


        trafficLight.SimulateTrafficLight();

    }
}
