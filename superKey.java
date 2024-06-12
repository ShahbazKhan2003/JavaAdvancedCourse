class Z{
    public Z(){
        System.out.println("in Z COnst");
    }
}

class A extends Z{
    public A(){
        System.out.println("in A Contructor");
    }
    public A(int n){
        System.out.println("int value in A");
    }
}

class B extends A{

    public B(){
        // super();   by default it s there 
        System.out.println("in B Constructor");
    }
    public B(int n){
        this();
        System.out.println("int value in B");
    }
}


public class superKey {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
