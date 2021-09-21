package trafficlight;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class TrafficLight {

    private String[] lights = {"GREEN", "YELLOW", "RED", "YELLOW"};
    private int count = 2;
    private String currentLight;
    private ArrayList<RoadUsers> users = new ArrayList<>();

    public TrafficLight() {
        currentLight = lights[count];
    }


    public void SimulateTrafficLight() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            count = (++count) % 4;
            currentLight = lights[count];
            System.out.println("\nLight is " + currentLight);

            for (RoadUsers user : users)
            {
                user.ReactToLight(currentLight);
            }
        }

    }

    public void addUser(RoadUsers user)
    {
        users.add(user);
    }
}
