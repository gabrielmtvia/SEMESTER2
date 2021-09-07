package Burgers;

public class MainMethod
{
  public static void main(String[] args)
  {
    Burgerbar burgerbar = new Burgerbar(4);
    BurgerBarEmployee employee1 = new BurgerBarEmployee("Nathan", burgerbar);
    BurgerBarEmployee employee2 = new BurgerBarEmployee("SpongeBob", burgerbar);
    BurgerBarCustomer customer1 = new BurgerBarCustomer("Johan", burgerbar, 2);
    BurgerBarCustomer customer2 = new BurgerBarCustomer("Marcus", burgerbar, 2);
    BurgerBarCustomer customer3 = new BurgerBarCustomer("Filip", burgerbar, 2);
    BurgerBarCustomer customer4 = new BurgerBarCustomer("Hans", burgerbar, 2);
    BurgerBarCustomer customer5 = new BurgerBarCustomer("Peter", burgerbar, 2);

    Thread t1 = new Thread(employee1, " Nathan");
    Thread t2 = new Thread(employee2," SpongeBob");
    Thread t3 = new Thread(customer1, "customer1");
    Thread t4 = new Thread(customer2, "customer2");
    Thread t5 = new Thread(customer3, "customer3");
    Thread t6 = new Thread(customer4, "customer4");
    Thread t7 = new Thread(customer5, "customer5");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();

  }
}
