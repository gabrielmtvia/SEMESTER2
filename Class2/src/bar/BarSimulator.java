package bar;

public class BarSimulator {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Bartender bartender1 = new Bartender(bar, "John");
        Bartender bartender2 = new Bartender(bar, "Johan");
        Bartender bartender3 = new Bartender(bar, "Jonas");

        Customer customer1 = new Customer(bar,"Customer 1");
        Customer customer2 = new Customer(bar,"Customer 2");
        Customer customer3 = new Customer(bar,"Customer 3");
        Customer customer4 = new Customer(bar,"Customer 4");
        Customer customer5 = new Customer(bar,"Customer 5");

        Thread t0 = new Thread(bar);

        Thread t1 = new Thread(bartender1);
        Thread t2 = new Thread(bartender2);
        Thread t3 = new Thread(bartender3);

        Thread t4 = new Thread(customer1);
        Thread t5 = new Thread(customer2);
        Thread t6 = new Thread(customer3);
        Thread t7 = new Thread(customer4);
        Thread t8 = new Thread(customer5);

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);
        t5.setDaemon(true);
        t6.setDaemon(true);
        t7.setDaemon(true);
        t8.setDaemon(true);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();



    }
}
