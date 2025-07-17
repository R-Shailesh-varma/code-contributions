class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin = 0, colBegin = 0, rowEnd = matrix.length -1 , colEnd = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            
            for(int i = colBegin; i <= colEnd; i++){
                res.add(matrix[rowBegin][i]);
            }rowBegin++;

            for(int j = rowBegin; j <= rowEnd; j++){
                res.add(matrix[j][colEnd]);
            }colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
                colBegin++;
            }

        }return res;
    }
}