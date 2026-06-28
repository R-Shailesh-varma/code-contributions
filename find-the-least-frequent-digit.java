class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] cnt = new int[10];
        while(n > 0){
            int r = n%10;
            cnt[r]++;
            n /= 10;
        }
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0; i < 10; i++){
            if(cnt[i] != 0 && cnt[i] < ans){
                ans = cnt[i];
                idx = i;
            }
        }

        return idx;
    }
}