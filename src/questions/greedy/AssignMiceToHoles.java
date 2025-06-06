package questions.greedy;

import java.util.Arrays;

/*

    Given, N Mice and N holes are placed in a straight line. Each hole can accommodate only 1 mouse. A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x -1. Any of these moves consumes 1 minute. Write a program to assign mice to holes so that the time when the last mouse gets inside a hole is minimized.
    Note: Arrays M and H are the positions of the N mice and holes.

*/
public class AssignMiceToHoles {
    public static void main(String[] args) {
        int N = 3;
        int[] M = {4,-4,2};
        int[] H = {4,0,5};
        System.out.println(holesToMice(N,M,H));
    }
    public static int holesToMice(int N, int[] M, int[] H){
        Arrays.sort(M);
        Arrays.sort(H);
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<N; ++i){
            ans = Math.max(ans, Math.abs(M[i] - H[i]));
        }
        return ans;
    }
}
