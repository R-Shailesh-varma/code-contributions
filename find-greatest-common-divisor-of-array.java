class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i: nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }return gcd(max, min);
    }public int gcd(int a,int b){
        if(a%b == 0){
            return b;
        }return gcd(b, a%b);
    }
}