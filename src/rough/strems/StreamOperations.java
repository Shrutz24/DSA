package rough.strems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1000,2,3,4,2,3,2,323,22,32,67,45,345,66);
        List<Integer> filteredList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filteredList);
        List<Integer> newList = filteredList.stream().map(x->x*10).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> processedList = list.stream()
                .filter(x->x%2==0)
                .distinct()
                .sorted()
                .map(x->x*100)
                .collect(Collectors.toList());
        System.out.println(processedList);
        List<Integer> processedListDescendingOrder = list.stream()
                .filter(x->x%2==0)
                .distinct()
                .sorted((a,b)->b-a)
                .limit(5)
                .map(x->x*100)
                .skip(2) //starting k kitne elements skip karne hai
                .collect(Collectors.toList());
        System.out.println(processedListDescendingOrder);

        List<Integer> collect = Stream.iterate(0,x->x +1)
                .limit(101)
                .skip(1)
                .filter(x->x%2==0)
                .map(x->x*10)
                .distinct()
                .sorted()
                .peek(x->System.out.println(x))
                .collect(Collectors.toList());
        System.out.println(collect);
        int min = Stream.iterate(0,x->x +1)
                .limit(101)
                .map(x->x*10)
                .peek(System.out::println)
                .max((a, b)->b-a)//finding the max in descending order means getting the min
                .get();
        System.out.println(min);
        long count = Stream.iterate(0,x->x +1)
                .limit(101)
                .distinct()
                .count();
        System.out.println(count);


    }
}
