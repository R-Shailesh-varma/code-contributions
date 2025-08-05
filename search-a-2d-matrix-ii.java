class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int j = 0, k = matrix[i].length-1;
            if(matrix[i][k] < target) continue;
            while(j <= k){
                int mid = (j+k)/2;
                if(matrix[i][mid] == target){
                    return true;
                }else if(matrix[i][mid] < target){
                    j = mid + 1;
                }else{
                    k = mid - 1;
                }
            }
        }return false;
    }
}