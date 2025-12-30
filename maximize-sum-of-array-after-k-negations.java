class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i: nums){
            minheap.offer(i);
        }for(int i = 0; i < k; i++){
            int num = minheap.poll();
            num = num * -1;
            minheap.offer(num);
        }int sum = 0;
        while(!minheap.isEmpty()){
            sum += minheap.poll();
        }return sum;
    }
}