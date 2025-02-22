package concepts.binarysearchexercise;

//Floor of a number
//Biggest element less than or equal to the target
public class Floor {
    public static void main(String[] args) {
        //int arr[] = {2,3,4,5,9,14,16,18};
        int arr[] = {18,16,14,9,5,4,3,2};
        int target = 8;
        System.out.println(floor(arr, target));
    }
    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(arr[start]<arr[end]){
            while(start<=end){

                int mid = start +(end - start)/2;

                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    return arr[mid];
                }
            }
            return arr[end];
        }else{
            while(start<=end){
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return arr[mid];
                }
            }
            return arr[start];

        }


    }
}
