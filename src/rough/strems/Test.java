package rough.strems;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        //imperative
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
        //declarative
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

    }
}