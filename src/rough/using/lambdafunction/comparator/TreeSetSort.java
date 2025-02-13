package rough.using.lambdafunction.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(22);
        set.add(1);
        set.add(13);
        System.out.println("Before sorting" + set);
        Set<Integer> sortedSet = new TreeSet<>((a,b)->b-a);
        sortedSet.add(22);
        sortedSet.add(1);
        sortedSet.add(13);
        System.out.println("After sorting" + sortedSet);
    }
}
