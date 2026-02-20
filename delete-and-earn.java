class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i: nums) max = Math.max(max, i);

        int[] freq = new int[max+1];
        for(int i: nums){
            freq[i]++;
        }

        int prev1 = 0;
        int prev2 = 0;
        if(max >= 1){
            prev1 = freq[1]*1;
        }

        for(int i = 2; i <= max; i++){
            int current = Math.max(prev1, prev2 + (freq[i]*i));
            prev2 = prev1;
            prev1 = current; 
        }

        return prev1;
    }
}