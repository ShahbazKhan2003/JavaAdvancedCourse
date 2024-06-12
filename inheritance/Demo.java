class A{
    int val = 10;
    public void func(){
        System.out.println("Parent");
    }
}
class B extends A{
    int val = 100;
    public void func(){
        System.out.println("Child");
    }
}

public class Demo {
    public static void main(String[] args) {
        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.sum(2, 10);
        // int r2 = obj.sub(20, 10);

        // //
        // int r3 = obj.mul(4, 2);
        // int r4 = obj.div(4, 2);

        // System.out.println(r1 + "  " + r2);
        // System.out.println(r3 + "  " + r4);

        A obj = new B();
        // obj.func();
        System.out.println(obj.val);
    }
}
