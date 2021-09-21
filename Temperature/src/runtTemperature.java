public class runtTemperature
{
  public static void main(String[] args)
  {
    Thermometer thermometer = new Thermometer("Thermometer 1", 25,1);
    Thermometer thermometer2 = new Thermometer("Thermometer 2", 25,7);

    Thread t1 = new Thread(thermometer);
    Thread t2 = new Thread(thermometer2);

    t1.start();
    t2.start();

  }
}
