package rough.using.lambdafunction.comparator;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b-a; //sort in descending order
        //return a-b; //sort in ascending order
    }
}
