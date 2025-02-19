package rough.strems.alltogether;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (x,y)->(x+y)%2 == 0;
        System.out.println(isSumEven.test(20,8));
        BiConsumer<String, String> biConsumer = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept("Should", "Work");
        BiFunction<String, String, String> biFunction = (x,y)->x + "\s" + y;
        System.out.println(biFunction.apply("Best", "Friends"));

        //Method references :: invokes methods and is used in place of lambda functions

        List<String> fruits = Arrays.asList("Pear", "Apples", "Cherries");
        fruits.forEach(System.out::print);

        //Constructor Reference
        List<String> names = Arrays.asList("A", "B", "C");
        names.stream().map(MobilePhones::new).collect(Collectors.toList());


    }
}
class MobilePhones{
    public MobilePhones(String names) {
        this.names = names;
    }

    String names;
}
