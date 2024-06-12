
class A implements Runnable {
    public void run(){
        for(int i=1;i<=500;i++){
            System.out.println("Hi");
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i=1;i<=500;i++){
            System.out.println("Hello");
        }
        
    }
}


public class usingInterface {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
