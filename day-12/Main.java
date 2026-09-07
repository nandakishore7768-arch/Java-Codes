class Counter{
    int counter = 0;

    public synchronized void increment(){
        this.counter += 1;
    }
}

public class Main{
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();

        Runnable obj = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };

        Thread th1 = new Thread(obj);
        Thread th2 = new Thread(obj2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(c.counter);
    }
}