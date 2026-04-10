class Solution {
    public int minimumDistance(int[] nums) {
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int max = Integer.MAX_VALUE;
        for(int i: map.keySet()){
            List<Integer> cur = map.get(i);
            if(cur.size() >= 3){
                for(int l = 0; l < cur.size()-2; l++){
                    max = Math.min(2* (cur.get(l+2) - cur.get(l)), max);
                }
            }
        }

        return max == Integer.MAX_VALUE ? -1 : max;

    }
}