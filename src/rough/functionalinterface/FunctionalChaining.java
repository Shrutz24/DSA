package rough.functionalinterface;

import java.util.function.Function;

public class FunctionalChaining {

    public static void main(String[] args) {
        Function<String, String> function = x-> x.toUpperCase() ;
        Function<String, String> function1 = x -> x.substring(0, 3);
        Function<String, String> function2 = function.andThen(function1);

        Function<Integer, Integer> function3 = x -> 2 * x;
        Function<Integer, Integer> function4 = x -> x * x* x;
        Function<String, String> identityFunction = Function.identity();

        System.out.println(function2.apply("Shruti"));
        System.out.println(function3.andThen(function4).apply(5));
        System.out.println(function4.andThen(function3).apply(5));
        System.out.println(function3.compose(function4).apply(5));
        System.out.println(identityFunction.apply("2"));
    }


}
