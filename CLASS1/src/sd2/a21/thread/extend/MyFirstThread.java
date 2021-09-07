package sd2.a21.thread.extend;

public class MyFirstThread extends Thread
{
  private String stringParam;

  public MyFirstThread(String stringParam)
  {
    this.stringParam = stringParam;
  }

  public static void main(String[] args)
  {
    MyFirstThread t1 = new MyFirstThread("One");
    t1.start();
    MyFirstThread t2 = new MyFirstThread("Two");
    t2.setDaemon(true);
    t2.start();
    sleepASecond();
    t1.setStrParam("exit");
  }

  private void setStrParam(String stringParam)
  {
    this.stringParam = stringParam;
  }

  @Override public void run()
  {
    while(!"exit".equals(stringParam))
    {
      System.out.println((isDaemon() ? "daemon" : "user") + "thread" + this.getName() + "[ID=" + this.getId() + "] passed parameter:" + stringParam);

      sleepASecond();
    }
    System.out.println((isDaemon() ? "daemon" : "user") + "thread" + this.getName() + "[ID=" + this.getId() + "] passed parameter:" + stringParam);

  }

  private static void sleepASecond(){
    try
    {
      Thread.sleep(1000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
