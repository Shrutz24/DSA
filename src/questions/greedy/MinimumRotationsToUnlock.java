package questions.greedy;
/*

    Given a lock made up of N different circular rings. Each ring has 0-9 digit printed on it. There is only one particular code which can open the lock. You can rotate each ring any number of times in either direction. Given the random sequence R and the desired sequence D, find the minimum number of rotations required to open the lock.

*/
public class MinimumRotationsToUnlock {
    public static void main(String[] args) {
        long R = 2345;
        long D = 5432;
        System.out.println(rotationCount(R,D));
    }
    public static int rotationCount(long R, long D){
        int ans = 0;
        long first, second;
        while(R >0){
            first = R % 10;
            second = D % 10;
            R/=10;
            D/=10;
            ans += (int) Math.min(Math.abs(first - second),10-Math.abs(first-second) );
        }
        return ans;
    }
}
