class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = 0;
        for(int i : nums){
            max = Math.max(max, i);
        }
        int freq[] = new int[max+1];
        int res[] = new int[nums.length];
        for(int i: nums){
            freq[i]++;
        }
        // int count = 0;
        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i-1];
        }
        int index = 0;
        for(int i: nums){
            if(i == 0){
                res[index++] = 0;
            }else{
                res[index++] = freq[i-1];
            }
        }return res;
    }
}