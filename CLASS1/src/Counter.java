public class Counter
{
  private long value;

  public Counter() {
  }

  /*public void increment()
  {
    value++;
  }

  public long getValue()
  {
    return value;
  }*/
  /*
  public synchronized void increment(){
    value++;
  }

  public synchronized long getValue(){
    return value;
  }*/

  public void increment(){
    synchronized(this)
    {
      value++;
    }
  }

  public long getValue(){
    synchronized (this){
      return value;
    }
  }
}

