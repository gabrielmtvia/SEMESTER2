public class CounterIncrementer implements Runnable
{
  private int updates;
  private Counter counter;

  public CounterIncrementer(Counter counter, int updates)
  {
    this.counter=counter;
    this.updates=updates;
  }

  @Override public void run()
  {
    for(int i=0;i<updates;i++)
    {
     counter.increment();
     //try
      //{
      //  Thread.sleep(500);
      //}
      //catch (InterruptedException e)
      //{
      //  e.printStackTrace();
      //}
      //System.out.println(Thread.currentThread().getName() + " " + counter.getValue());
      //if(counter.getValue()>=updates) break;
    }
    System.out.println(Thread.currentThread().getName() + " " + counter.getValue());

  }
}
