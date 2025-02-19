package rough.strems.alltogether;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
       List<Integer> numList = Arrays.asList(10,9,8,7,6,5,4,3,2,1);

       //collect
        List<Integer> l1 = numList.stream().skip(3).collect(Collectors.toList());
        List<Integer> l2 = numList.stream().skip(2).toList();
        //System.out.println(numList.stream().skip(2).toList());

        //forEach
        numList.stream().forEach(System.out::println);

        //reduce : combines all the elements to produce a single result

        //This is a simple logic to that does sum += next number and hence returns the complete summation
        //all the entries in the list
        System.out.println(numList.stream().reduce((x,y) -> x+y).get());

        //count
        numList.stream().count();

        //anyMatch, allMatch, noneMatch
        boolean b1 = numList.stream().anyMatch(x -> x % 2 == 0);
        boolean b2 = numList.stream().allMatch(x -> x > 0);
        boolean b3 = numList.stream().noneMatch(x -> x < -1);

        System.out.println(b1 + " :: " + b2 + " :: " + b3 );

        //findFirst, findAny

        Optional<Integer> any = numList.stream().findAny();
        System.out.println(any.get());
        Optional<Integer> first = numList.stream().findFirst();
        System.out.println(first.get());



    }
}
