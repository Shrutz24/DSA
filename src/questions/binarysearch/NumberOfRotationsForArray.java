package questions.binarysearch;

public class NumberOfRotationsForArray {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
        int pivot = pivotWithDuplicate(arr);
        int rotations = arr.length-1 - pivot;
        System.out.println(rotations);
    }
    public static int pivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            //4 cases to find pivot
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if element at middle, start and end are equal then just skip the duplicate elements.
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //NOTE: What if end or start is the pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                ++start;
                if(arr[end] < arr[end - 1]){
                    return end;
                }
                --end;

            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
