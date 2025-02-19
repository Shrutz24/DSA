package rough.strems.alltogether;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //java 8 feature
        //functionaland declarative programming
        //simple data processing
        //easy parallelism
        //readable

        //source, intermediate and terminal operations

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        evenList.forEach(System.out::println);


        //Creation of stream
        //    1. For collections
        List<Integer> collections = Arrays.asList(1,2,3,4);
        Stream<Integer> stream = collections.stream();
        // 2.  2. For Arrays
        int[] array = {1,2,3,4};
        IntStream stream1 = Arrays.stream(array);
        // 3. Stream.of()
        Stream<String> stream2 = Stream.of("a,b,c,d");
        //4. Infinite Stream
        Stream<Integer> limit = Stream.generate(() -> 1);
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);


        System.out.println(Stream.iterate(1, x->x+1).limit(20).collect(Collectors.toList()));
    }
}
