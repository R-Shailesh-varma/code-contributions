class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            return b[1] - a[1];
        });
        for(int i: map.keySet()){
            pq.offer(new int[]{i, map.get(i)});
        }

        List<Integer> lis = new ArrayList<>();
        while(k > 0 && !pq.isEmpty()){
            int[] cur = pq.poll();
            lis.add(cur[0]);
            k--;
        }
        int[] res = new int[lis.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = lis.get(i);
        }

        return res;

    }
}