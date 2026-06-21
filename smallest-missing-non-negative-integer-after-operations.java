class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] cnt = new int[value];
        for(int i: nums){
            int r = ((i % value) + value) % value;
            cnt[r]++;
        }

        int cur = 0;
        while(cnt[cur % value] > 0){
            cnt[cur % value]--;
            cur++;
        }
        return cur;
    }
}