class A{
    int var = 10;
    public void show(){
        System.out.println("In parent");
    }
}
class B extends A{
    int var1 = 100;
    public void show1(){
        System.out.println("In Child");
    }
}

public class up {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println(obj.var);
        // obj.show1();
    }
}
