package sd2.a21.thread.extend;

import java.util.ArrayList;

public class ThreadMain
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<>();
    Adding adding1 = new Adding("A",1000,list);
    Adding adding2 = new Adding("B", 1000, list);
    Adding adding3 = new Adding("C", 1000, list);
    Thread t1 = new Thread(adding1, "adding1");
    Thread t2 = new Thread(adding2, "adding2");
    Thread t3 = new Thread(adding3, "adding3");
    t1.start();
    t2.start();
    t3.start();
    if(!Thread.currentThread().isAlive())
    {
      System.out.println("List size: " + list.size());
      for(int i =0;i<list.size();i++)
      {
        System.out.println(list.get(i));
      }
    }
  }


}
