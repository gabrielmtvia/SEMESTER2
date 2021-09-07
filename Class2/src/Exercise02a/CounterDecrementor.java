package Exercise02a;

public class CounterDecrementor implements Runnable
{
  public int updates;
  public Counter counter;

  public CounterDecrementor(Counter counter, int updates)
  {
    this.counter = counter;
    this.updates = updates;
  }
  @Override public void run()
  {
    for(int i=0;i<updates;i++)
    {
      counter.decrement();
    }
  }
}
