public class CounterMain
{
  public static void main(String[] args)
  {
    Counter counter = new Counter();
    CounterIncrementer counterIncrementer = new CounterIncrementer(counter, 20000000);
    CounterIncrementer counterIncrementer2 = new CounterIncrementer(counter, 20000000);

    Thread t1 = new Thread(counterIncrementer, "Incrementor1");
    Thread t2 = new Thread(counterIncrementer2, "Incrementor2");

    t1.start();
    t2.start();

    System.out.println("Main Thread Ended");

    //System.out.println(Thread.currentThread().getName() + " " + counter.getValue());


  }
}
