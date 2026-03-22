class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        return is0(mat, target) || is90(mat, target) || is180(mat, target) || is270(mat, target);
    }

    boolean is90(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[j][n - 1 - i]) return false;
            }
        }
        return true;
    }

    boolean is180(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[n - 1 - i][n - 1 - j]) return false;
            }
        }
        return true;
    }

    boolean is270(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[n - 1 - j][i]) return false;
            }
        }
        return true;
    }

    boolean is0(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}