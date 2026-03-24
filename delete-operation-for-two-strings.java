class Solution {
    public int minDistance(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int[][] dp = new int[w1][w2];
        return recur(dp, word1, word2, 0, 0);
    }int recur(int[][] dp, String word1, String word2, int i, int j){
        if(i == word1.length() && j == word2.length()) return 0;
        if(i == word1.length()) return word2.length() - j;
        if(j == word2.length()) return word1.length() - i;
        if(dp[i][j] != 0) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = recur(dp, word1, word2, i+1, j+1);
        }else{
            int del1 = recur(dp, word1, word2, i+1, j);
            int del2 = recur(dp, word1, word2, i, j+1);
            dp[i][j] = 1 + Math.min(del1, del2);
        }
        return dp[i][j];
    }
}