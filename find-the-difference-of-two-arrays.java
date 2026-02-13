class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> sol = new ArrayList<>();
        sol.add(new ArrayList<>());
        sol.add(new ArrayList<>());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i: nums1) set1.add(i);
        for(int i: nums2) set2.add(i);
        for(int i: set1){
            if(!set2.contains(i)){
                sol.get(0).add(i);
            }
        }for(int i: set2){
            if(!set1.contains(i)){
                sol.get(1).add(i);
            }
        }return sol;
    }
}