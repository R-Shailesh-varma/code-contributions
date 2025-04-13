class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ind = {-1, -1};
        while(l < r){
            if(numbers[l] + numbers[r] < target){
                l += 1;
            }else if(numbers[l] + numbers[r] == target ){
                ind[0] = l+1;
                ind[1] = r+1;
                return ind;
            }else{
                r -= 1;
            }
        }return ind;
    }
}