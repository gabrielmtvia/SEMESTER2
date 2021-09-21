package bar;

public class Customer implements Runnable{

    private String name;
    private Bar bar;

    public Customer(Bar bar, String name)
    {
        this.bar=bar;
        this.name = name;
    }


    @Override
    public void run() {
        while(bar.barIsOpen)
        {
            bar.takeBeer(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
