interface A{
    void show();
    void config();
}

interface X{
    void run();
}

class B implements A , X{
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
    public void run(){
        System.out.println("run");
    }
}

public class index {
    public static void main(String[] args) {
        A obj = new B();
        obj.config();
        obj.show();

        X obj1 = new B();
        obj1.run();
    }
}
