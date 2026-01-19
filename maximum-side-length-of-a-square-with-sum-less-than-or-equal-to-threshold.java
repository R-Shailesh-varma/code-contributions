class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length; 
        int m = mat[0].length;
        int[][] prefix = new int[n+1][m+1];
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                prefix[i][j] = mat[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }

        int left = 0, right = Math.min(n, m), ans = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(isSquare(prefix, mid, threshold)){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }return ans;
    }private boolean isSquare(int[][] mat, int len, int threshold){
        if(len == 0) return true;
        for(int i = len; i < mat.length; i++ ){ 
            for(int j = len; j < mat[0].length; j++){
                int sum = mat[i][j] + mat[i-len][j-len] - mat[i][j-len] - mat[i-len][j];
                if(sum <= threshold) return true; 
            }
        }return false;
    }
}