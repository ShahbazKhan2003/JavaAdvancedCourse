
class ShahbazException extends Exception{
    public ShahbazException(String s){
        super(s);
    }
}

public class index {
    public static void main(String[] args) {
        int i = 20;

        int j = 0;

        try{
            j =  18 / i;
            if(j==0){
                throw new ShahbazException("Exception");
            }
            
        }
        catch(ShahbazException E){
            System.out.println("Something went wrong shahbaz " + E);
        }
        
        catch(Exception E){
            System.out.println("Exception went wrong " + E);
        }
    }
}
