class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int n = nums.length/2;
        for(int i: nums){
            count.put(i, count.getOrDefault(i, 0)+1);
            if(count.get(i) == n) return i;
        }return -1;   
    }
}