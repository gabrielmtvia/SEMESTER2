package sd2.a21.thread.extend;

import java.util.ArrayList;

public class Adding implements Runnable
{
  private String id;
  private long sleepTime;
  private ArrayList<String> list;

  public Adding(String id, long sleepTime, ArrayList<String> list)
  {
    this.id = id;
    this.sleepTime = sleepTime;
    this.list = list;
  }

  @Override public void run()
  {

    for(int i = 0;i<5;i++)
    {
      list.add(id +"#"+i);
      System.out.println(id);
      for(int j = 0;j<list.size();j++)
      {
        System.out.println(list.get(j));
      }
      sleepASecond(sleepTime);
    }
  }

  private void sleepASecond(long sleepTime)
  {
    try
    {
      Thread.sleep(sleepTime);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
