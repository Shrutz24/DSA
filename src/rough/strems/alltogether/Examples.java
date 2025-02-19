package rough.strems.alltogether;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apples", "Banannas", "Cherries", "Pear", "Chiku");

        //Finding all the fruits whoese length is greater than 4

        System.out.println(fruits.stream().filter(x->x.length() > 4).toList());

        //Squaring and sorting numbers

        List<Integer> numbers = Arrays.asList(3,54,76,8,2,9,10);
        System.out.println(numbers.stream().map(x->x * x).sorted((a,b)->b-a).toList());
        System.out.println(numbers.stream().filter(x->x%2 != 0).map(x->Math.pow(x,6)).sorted().collect(Collectors.toList()));
        System.out.println(numbers.stream().reduce((x,y)->x+y).get());

        //Count the number of occurances of a chatacter
        String senctance = "Stop wishing start doing";
        System.out.println(Arrays.asList(senctance.split("")).stream().filter(x->x.toLowerCase().equals("i")).count());

    }
}
