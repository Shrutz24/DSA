package concepts;

public class LinearSearchInRange {
    public static void main(String[] args) {
        System.out.println("Linear Search In Range");
        int[] array = {1,2,3,4,5,6,789,8,9,120,2355,4543,54,345,3,452};
        int start = 4;
        int end = 10;
        int target = 120;
        System.out.println(searchInRange(array, target, start, end));
    }
    public static int searchInRange(int[] array, int target, int start, int end){
        if(array.length > start && array.length >=end){
            for(int i=start; i<=end; ++i){
                if(array[i] == target){
                    return i;
                }
            }
            return -1;
        }else return -1;
    }
}
