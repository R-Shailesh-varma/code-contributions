class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int sum = nums[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i < n; i++){
            pq.add(nums[i]);
        }
        int c = 0;
        while(!pq.isEmpty() && c < 2){
            sum += pq.poll();
            c++;
        }

        return sum;
    }
}