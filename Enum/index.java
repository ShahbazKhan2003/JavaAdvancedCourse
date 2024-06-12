
enum Status{
    Running , Pending , Success , Failure; 
}

public class index {
    public static void main(String[] args) {
        // Status s = Status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // Status s[] = Status.values();

        // for(var it: s){
        //     System.out.println(it);
        // }
        

        Status s = Status.Pending;
        if(s == s.Pending){
            System.out.println("Matches");
        }
        else System.out.println("Not Matches");
    }
}
