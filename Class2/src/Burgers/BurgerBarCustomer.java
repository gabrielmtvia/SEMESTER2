package Burgers;

public class BurgerBarCustomer implements Runnable
{
  private int burgersToEat;
  private String name;
  private Burgerbar burgerbar;

  public BurgerBarCustomer(String name, Burgerbar burgerbar, int burgersToEat)
  {
    this.name = name;
    this.burgerbar = burgerbar;
    this.burgersToEat = burgersToEat;
  }
  @Override public void run()
  {
    for(int i=0;i<burgersToEat;i++)
    {
      burgerbar.eatBurger();

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
}
