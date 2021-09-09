package Burgers;

public class Burgerbar
{
  private int numberOfBurgers;
  private int maxNumberOfBurgers;


  public Burgerbar(int maxNumberOfBurgers)
  {
    this.maxNumberOfBurgers=maxNumberOfBurgers;
    numberOfBurgers=0;
  }

  public synchronized void makeBurger(String employeeName)
  {
    while(numberOfBurgers>=maxNumberOfBurgers)
    {

        System.out.println("Current employee waiting" + Thread.currentThread().getName());
        Thread.currentThread().stop();

    }
     notify();
      numberOfBurgers++;
      System.out.println(employeeName + ": who is ready to eat a burger (" +numberOfBurgers+ " left)");

  }

  public synchronized void eatBurger()
  {
    while(numberOfBurgers<=0)
    {
      try
      {
        System.out.println("Current customer is waiting" + Thread.currentThread().getName());
        wait();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    notify();
      System.out.println(
          "Customer eating a burger (" + numberOfBurgers + " left)" + Thread.currentThread().getName());
      numberOfBurgers--;
  }

  public int getNumberOfBurgers()
  {
    return numberOfBurgers;
  }
}
