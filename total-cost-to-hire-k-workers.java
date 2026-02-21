class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        int left = 0;
        int right = n - 1;

        PriorityQueue<Integer> first = new PriorityQueue<>();
        PriorityQueue<Integer> second = new PriorityQueue<>();
        
        for (int i = 0; i < candidates && left <= right; i++) {
            first.offer(costs[left++]);
        }

        for (int i = 0; i < candidates && left <= right; i++) {
            second.offer(costs[right--]);
        }

        long sum = 0;
        while (k-- > 0) {
            if (second.isEmpty() || 
               (!first.isEmpty() && first.peek() <= second.peek())) {
                sum += first.poll();
                if (left <= right) {
                    first.offer(costs[left++]);
                }
            } else {
                sum += second.poll();
                if (left <= right) {
                    second.offer(costs[right--]);
                }
            }
        }

        return sum;
    }
}