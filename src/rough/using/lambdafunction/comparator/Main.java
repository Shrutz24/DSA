package rough.using.lambdafunction.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(7);
        list.add(4);
        list.add(3);
        //Collections.sort(list);
        //Collections.sort(list, new MyClass());
        Collections.sort(list, (a,b) -> b-a ); // using lambda expression
        System.out.println(list);

    }
}
