class Solution {
    public char findKthBit(int n, int k) {
        String[] dp = new String[n];
        StringBuilder sb = new StringBuilder();
        dp[0] = "0";
        for(int i = 1; i < n; i++){
            sb.append(dp[i-1]);
            sb.append(1);
            sb.append(sRev(dp[i-1]));
            dp[i] = sb.toString();
            sb.setLength(0);
        }return dp[n-1].charAt(k-1);
    }
    
    private String sRev(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append((c - '0') ^ 1 );
        }return sb.reverse().toString();
    }
}