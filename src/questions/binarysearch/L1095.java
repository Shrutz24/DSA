package questions.binarysearch;

public class L1095 {
    public static void main(String[] args) {
        int[] arr = {0,5,3,1};
        int target = 1;
        System.out.println(targetInMountain(arr, target));
    }
    public static int targetInMountain(int[] arr, int target) {

        int peek = peek(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peek);
        if(firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBinarySearch(arr, target, peek+1, arr.length-1);
        }
    }
    public static int peek(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //decreasing part of array
                //this may be the ans, but check left.
                end = mid;
            }else {
                //you are in the ascending part of the array
                start = mid + 1; //as mid + 1 > mid
            }

        }
        //in the end start == end
        return start;
        //return 1;
    }
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        if(arr[start] < arr[end]){
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    return mid;
                }
            }
        }else {
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
