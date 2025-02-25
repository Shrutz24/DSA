package questions.binarysearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(pivot(arr));
        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0, arr.length-1);
        }else{
           int firstTry = binarySearch(arr, target, 0, pivot);
           if(firstTry != -1)
               return firstTry;
           else
               return binarySearch(arr, target, pivot + 1, arr.length-1);
        }
    }
    public static int pivot(int[] arr){
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
            }if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end  = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
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
