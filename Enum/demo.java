enum Laptop{
    Mac(1000) , Dell(800) , Lenovo(500) , Acer(200);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getter(){
        return (this.price);
    }
}

public class demo {
    public static void main(String[] args) {
        Laptop lap = Laptop.Acer;
        
        for(Laptop l : Laptop.values()){
            System.out.println(l +" : " + l.getter());
        }
    }
}
