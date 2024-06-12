class Human{
    private int age; 
    private String name;

    public Human(){
        this.age = 20;
        this.name = "xyz";
    }
    public Human(int age , String name){
        this.age = age;
        this.name = name;
    }

    public void setter(int age , String name){
        this.age = age;
        this.name = name;
    }
    public void getter(){
        System.out.println(this.age + " " + this.name);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(21  , "abc");

        obj.getter();
        obj1.getter();

    }
}
