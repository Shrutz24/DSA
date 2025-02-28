package concepts;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Hello Linear Search!");
        int[] array = {1,2,3,4,5,6,7,8,9,0,12,12,14,25,67,34};
        int target = 2;
        System.out.println(linearSearchIndex(array, target));
        System.out.println(linearSearchTarget(array, target));
        System.out.println(linearSearchBoolean(array, target));
    }
    public static int linearSearchIndex(int[] array, int target){
        if(array.length == 0) return -1;
        else {
            for(int i=0; i<array.length; ++i){
                if(target == array[i]) return i;
            }
            return -1;
        }
    }

    public static int linearSearchTarget(int[] array, int target){
        if(array.length == 0) return -1;
        else {
            for(int i=0; i<array.length; ++i){
                if(target == array[i]) return target;
            }
            return Integer.MAX_VALUE;
        }
    }
    public static boolean linearSearchBoolean(int[] array, int target){
        if(array.length == 0) return false;
        else {
            for(int i=0; i<array.length; ++i){
                if(target == array[i]) return true;
            }
            return false;
        }
    }

}
