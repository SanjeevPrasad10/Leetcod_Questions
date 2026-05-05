class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int low = 0;
        int high = rows*column -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int value = matrix[mid/column][mid%column];

            if(value == target){
                return true;
            }
            else if(value<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}