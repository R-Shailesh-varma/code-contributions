class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i = 1; i < n; i++){
            if(String.valueOf(i).contains("0") || String.valueOf(n-i).contains("0")){
                continue;
            }ans[0] = i;
            ans[1] = n - i;
            break;
        }return ans;
    }
}