package rough.strems.alltogether;
/*
    Type of stream that enables parallel processing of the streams
    Allows multiple threads to process parts of streams simultaneously
    Improves performance for large data sets as workset gets distributed across multiple threads.

    Used for stateless operations which are CPU intensive or require large datasets.
*/


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
       // System.out.println(list);
        List<Long> factorialList = list.stream().map(ParallelStreams::factorial).toList();
       // System.out.println(factorialList);

        long end = System.currentTimeMillis();
        System.out.println(end-start + " in ms");

        start = System.currentTimeMillis();
        factorialList = list.parallelStream().map(ParallelStreams::factorial).toList();
        end = System.currentTimeMillis();
        System.out.println(end-start + " in ms");

        //Demonstration of stateless nature of parallel stream
        //Cumulative sum
        //[1,2,3,4,5] -> [1,3,6,10,15]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //int sum = 0;
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(cumulativeSum); // The order is not maintained in parallel stream. Order is maintained in stream
        AtomicInteger streamsum = new AtomicInteger(0);
        cumulativeSum = numbers.stream().map(x -> streamsum.addAndGet(x)).toList();
        System.out.println(cumulativeSum);
        AtomicInteger sequentialSum = new AtomicInteger(0);
        cumulativeSum = numbers.parallelStream().sequential().map(x -> sequentialSum.addAndGet(x)).toList(); //use sequential while using parallel stream for stateful operations
        System.out.println(cumulativeSum);
    }

    private static long factorial(int n){
        long result = 1;
        for(int i=2; i<=n; ++i){
            result *= i;
        }
        return result;
    }
}
