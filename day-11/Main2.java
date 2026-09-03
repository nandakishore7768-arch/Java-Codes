class Counter{
    int count = 0;

    public synchronized void increment(){
        count++;
    }
}

public class Main2{
    public static void main(String[] args) throws InterruptedException
    {

        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 0; i< 1000; i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 0; i< 1000; i++){
                c.increment();
            }
        };

        Thread a1 = new Thread(obj1);
        Thread a2 = new Thread(obj2);
        
        a1.start();
        a2.start();

        a1.join();
        a2.join();

        System.out.println(c.count);
    }
}