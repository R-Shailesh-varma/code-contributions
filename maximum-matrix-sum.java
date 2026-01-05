class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int maxNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        long sum = 0;
        int nz = 0;
        int neg = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    maxNeg = Math.max(maxNeg, matrix[i][j]);
                    neg++;
                }else if(matrix[i][j] == 0){
                    nz++;
                }else{
                    minPos = Math.min(minPos, matrix[i][j]);
                }
            }
        }if(neg%2 != 0){
            if(minPos < Math.abs(maxNeg) && nz == 0){
                sum -= 2 * minPos;
            }else if(nz > 0){
                sum += 0;
            }else{
                sum -= 2 * Math.abs(maxNeg);
            }
        }return sum;
    }
}