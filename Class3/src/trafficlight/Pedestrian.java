package trafficlight;

public class Pedestrian implements RoadUsers{
    private int id;

    public Pedestrian(int id){
        this.id = id;
    }

    @Override
    public void ReactToLight(String currentLight) {
        if("GREEN".equals(currentLight)){
            System.out.println("Pedestrian " + id + " waits");
        } else if ("RED".equals(currentLight)){
            System.out.println("Pedestrian " + id + " walks");
        }
    }
}
