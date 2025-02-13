package rough.predicates;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicates {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicates = (x, y)-> x%2 ==0 && y%2 ==0;
        System.out.println(biPredicates.test(2, 8));
        BiFunction<String, String, Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Shruti", "Meshram"));
        BiConsumer<Integer, Integer> biConsumer = (x,y)->System.out.println(x+y);
        biConsumer.accept(2,5);


    }
}
