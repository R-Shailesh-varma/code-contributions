class Solution {
    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> keySet = map.keySet();
        Integer[] keys = keySet.toArray(new Integer[0]);
        int maxLen = 0;
        for(int i = 0; i < keys.length-1; i++){
            if(keys[i+1] - keys[i] == 1){
                int sum = map.get(keys[i]);
                sum += map.get(keys[i+1]);
                maxLen = Math.max(maxLen, sum);
            }
        }

        return maxLen;
    }
}