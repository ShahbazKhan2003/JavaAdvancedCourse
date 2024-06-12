import java.util.*;
import java.util.stream.Stream;

public class index {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(4 , 5 , 7, 3 , 2 , 6);

        // Stream<Integer> s1 = li.stream();

        // Stream<Integer> s2 = s1.filter((n) -> {
        //     return n%2==0;
        // });

        // s2.forEach((n)->{
        //     System.out.println(n);
        // });


        // Stream<Integer> s3 = s2.map(n -> n*2);

        // int sum = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(sum);

        // s3.forEach(n -> System.out.println(n));

        // int ans = li.stream()
        //     .filter(n -> n%2==0)
        //     .map(n -> n*2)
        //     .reduce(0 , (c ,e ) -> c+e);

        Stream<Integer> ans = li.stream()
                                    .filter(n -> n%2==0)
                                    .sorted((a, b) -> b-a);

        ans.forEach(n -> System.out.println(n));

    }
}
