class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        if(arr.length <= 1) return ans;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            int val = arr[i+1] - arr[i];
            if(val < min){
                ans.clear();
                min = val;
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }else if(val == min){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }return ans;
    }
}