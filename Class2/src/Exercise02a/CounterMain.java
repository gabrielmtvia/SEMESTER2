package Exercise02a;

public class CounterMain
{
  public static void main(String[] args)
  {
    Counter counter = new Counter(1,5);
    CounterIncrementor counterIncrementor1 = new CounterIncrementor(counter,2);
    CounterIncrementor counterIncrementor2 = new CounterIncrementor(counter,2);
    CounterDecrementor counterDecrementor1 = new CounterDecrementor(counter,2);
    CounterDecrementor counterDecrementor2 = new CounterDecrementor(counter,2);

    Thread t1 = new Thread(counterIncrementor1, "Thread 1");
    Thread t2 = new Thread(counterIncrementor2, "Thread 2");
    Thread t3 = new Thread(counterDecrementor1, "Thread 3");
    Thread t4 = new Thread(counterDecrementor2, "Thread 4");

    t1.start();
    t2.start();
    t3.start();
    t4.start();

  }
}
