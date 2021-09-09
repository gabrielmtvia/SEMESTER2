package Exercise02a;

public class Counter
{
  private long value;
  private long min;
  private long max;

  public Counter(long min, long max)
  {
    this.min=min;
    this.max=max;
    value=0;
  }

  public synchronized void increment()
  {
    if (value>=max)
    {
      try
      {
        System.out.println(value + ": " + Thread.currentThread().getName() + " Wait State");
        wait();

      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    else {
      notifyAll();
      value++;

    System.out.println(value + ": " + Thread.currentThread().getName() + " Value updated");
    }
  }

  public synchronized void decrement()
  {
    if(value<=min)
    {
      try
      {
        System.out.println(value + ": " + Thread.currentThread().getName()+ " Wait State");
        wait();

      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    else {
      notifyAll();
      value--;
      System.out.println(value + ": " + Thread.currentThread().getName() + " Value updated");
    }
  }

}
