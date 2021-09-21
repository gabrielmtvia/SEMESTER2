package bar;

import java.util.ArrayList;

public class Bar implements Runnable{
    private ArrayList<Beer> listOfBeers = new ArrayList<>();
    private int maxNumOfBeers = 20;
    public boolean barIsOpen = true;

    public synchronized void placeBeer(Beer b)
    {
        if(listOfBeers.size()>=maxNumOfBeers)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
        {
            listOfBeers.add(b);
            notifyAll();
        }
    }

    public synchronized void takeBeer(String name)
    {
        if(listOfBeers.size()>0)
        {
            listOfBeers.remove(listOfBeers.size()-1);
            System.out.println(name + "is drinking a beer");
        }
        else if (listOfBeers.size()<=0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        barIsOpen = false;
        System.out.println("Bar is closing, everybody home");
    }
}
