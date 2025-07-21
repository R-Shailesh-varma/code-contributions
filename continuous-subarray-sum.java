class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixMod = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            prefixMod += nums[i];
            int mod = (k == 0) ? prefixMod : prefixMod % k;
            if(map.containsKey(mod)){
                if(i - map.get(mod) >= 2){
                    return true;
                }
            }else{
                map.put(mod, i);
            }
        }return false;
    }
}