class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i: arr){
            sum += i;
        }if(sum%3 != 0){
            return false;
        }List<List<Integer>> res = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int gSum = 0;
        for(int i: arr){
            gSum += i;
            nums.add(i);
            if(gSum == sum/3){
                res.add(new ArrayList<>(nums));
                nums = new ArrayList<>();
                gSum = 0;
            }
        }return (res.size() >= 3);
    }
}