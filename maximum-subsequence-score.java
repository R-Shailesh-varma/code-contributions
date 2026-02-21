class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        if(n < k) return 0;
        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        Arrays.sort(pairs, (a, b)->{
            return b[1] - a[1];
        });

        int count = 0;
        long sum = 0;
        long maxProd = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            
            pq.offer(pairs[i][0]);
            sum += pairs[i][0];
            count++;

            if(count > k){
                count--;
                sum -= pq.poll();
            }

            if(count == k){
                maxProd = Math.max(maxProd, sum * pairs[i][1]);
            }
        }

        return maxProd;

    }
}