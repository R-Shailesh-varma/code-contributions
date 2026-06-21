class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        int ans = -1;
        for(int i: freq.keySet()){
            if(i == freq.get(i)){
                ans = Math.max(ans, i);
            }
        }

        return ans;
    }
}