package trafficlight;

public class Taxi implements RoadUsers{

    private int id;

    public Taxi(int id){
        this.id = id;
    }

    @Override
    public void ReactToLight(String currentLight) {
        if("GREEN".equals(currentLight)){
            System.out.println("Taxi " + id + " drives super fast");
        } else if ("RED".equals(currentLight)){
            System.out.println("Taxi " + id + " stops with a screething tires");
        }
    }
}
