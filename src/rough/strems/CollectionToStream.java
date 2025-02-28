package rough.strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apples", "Chiku", "Avacado");
        Stream<String> fruitStream = fruits.stream();

        String[] array = {"Banana", "Apples", "Chiku", "Avacado"};
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(10);
        Stream<String> limit1 = Stream.generate(()->"hello").limit(5);
    }
}
