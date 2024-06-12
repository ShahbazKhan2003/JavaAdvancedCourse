class Mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
        System.out.println("how many time i call");
    }

    public Mobile(){
        brand = "";
        price = 18000;
    }

    public void display(){
        System.out.println(brand +" " + price +" "+ name);
    }
    public  static void display(Mobile obj){
        System.out.println(obj.brand +" " + obj.price +" "+ name);
    }
}

public class staticKeyword {
    // static{
    //     System.out.println("yo");
    // }
    public static void main(String[] args)  {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 80000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 50000;

        // obj1.display();
        // obj2.display();

        Mobile.display(obj1);
        
        
    }
}
