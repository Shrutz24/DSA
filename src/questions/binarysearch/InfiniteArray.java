package questions.binarysearch;

//Find target in an infinite array.
//Cannot use arrays.length
public class InfiniteArray {
    public static void main(String[] args) {

        //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int[] array = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210};
        int target = 10;
        System.out.println(findRange(array,target));
    }
    public static int findRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            //double the box size and add the end
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
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
}
