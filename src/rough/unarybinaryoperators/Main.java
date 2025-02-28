package rough.unarybinaryoperators;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Function<String, String> function1 = x -> x.toLowerCase();
        UnaryOperator<String> function1 = x -> x.toLowerCase();
        System.out.println(function1.apply("SHRUTI"));

        //BiFunction<String, String, String> function2 = (x,y)->x+y;
        BinaryOperator<String> function2 = (x,y)->x+y;
        System.out.println(function2.apply("shruti","meshram"));
    }
}
