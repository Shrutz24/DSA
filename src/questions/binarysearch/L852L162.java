package questions.binarysearch;

public class L852L162 {
    public static void main(String[] args) {
        int[] num = {0,1,0};
        System.out.println(peek(num));
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
}
