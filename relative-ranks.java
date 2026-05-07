class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
            return Integer.compare(score[b], score[a]);
        });

        for(int i = 0; i < score.length; i++){
            pq.offer(i);
        }

        int n = score.length;
        String[] ans = new String[n];
        if(!pq.isEmpty()){
            int c = pq.poll();
            ans[c] = "Gold Medal";
        }
        if(!pq.isEmpty()){
            int c = pq.poll();
            ans[c] = "Silver Medal";
        }
        if(!pq.isEmpty()){
            int c = pq.poll();
            ans[c] = "Bronze Medal";
        }

        int i = 4;
        while(!pq.isEmpty()){
            int c = pq.poll();
            ans[c] = String.valueOf(i++);
        }

        return ans;

    }
}