class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadSafe {
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                // System.out.println(c.count);
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                // System.out.println(c.count);
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception E){
            System.out.println(E);
        }

        System.out.println(c.count);
    }
}
