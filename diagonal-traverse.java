class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return new int[0];
        
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int i = 0, r = 0, c = 0;
        boolean up = true;

        while (i < rows * cols) {
            result[i++] = mat[r][c];

            if (up) {
                if (c == cols - 1) {  // hit right border
                    r++;
                    up = false;
                } else if (r == 0) {  // hit top border
                    c++;
                    up = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == rows - 1) {  // hit bottom border
                    c++;
                    up = true;
                } else if (c == 0) {  // hit left border
                    r++;
                    up = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
