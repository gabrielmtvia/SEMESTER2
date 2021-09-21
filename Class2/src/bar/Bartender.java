package bar;

public class Bartender implements Runnable{

    private String name;
    private Bar bar;

    public Bartender(Bar bar, String name)
    {
        this.bar=bar;
        this.name = name;
    }

    @Override
    public void run() {
        while(bar.barIsOpen)
        {
            bar.placeBeer(new Beer());
            System.out.println("Beer placed by " + name);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
