class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++){
            if(setBits(i) == k) ans += nums.get(i);
        }return ans;
    }
    int setBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;

    }
}