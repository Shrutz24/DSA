package concepts.binarysearchexercise;

public class SearchInSortedMatrix {
    public static void main(String[] args) {

    }

    //This is the binary search on the provided row
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(target > matrix[row][mid]){
                cStart = mid + 1;
            }else if(target < matrix[row][mid]){
                cEnd = mid - 1;
            }else if (matrix[row][mid] == target){
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        //run till only two rows remain
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols/2;

        while(rowStart < rowEnd){ //Till this more than two rows remain.
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[mid][colMid] == target){
                return new int[] {mid, colMid};
            }
            if(matrix[mid][colMid] < target){
                rowStart = mid;
            }
            if(matrix[mid][colMid] > target){
                rowEnd = mid;
            }

        }
        //now there remains two rows

        if(matrix[rowStart][colMid] == target){
            return new int[] {rowStart, colMid};
        }
        if(matrix[rowStart + 1][colMid] == target){
            return new int[] {rowStart + 1, colMid};
        }

    }

}
