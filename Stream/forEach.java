import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(4 , 3 , 7 , 12 , 15);

        // Consumer<Integer> con = (t) -> {
        //         System.out.print(t*2+" ");
        // };
        // li.forEach(con);

        Stream<Integer> s1 = li.stream();

        

        s1.forEach((t) ->{
            System.out.println(t*2);
        });
        
    }
}
