class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 0;
        // int num = candyType[0];
        HashSet<Integer> nums = new HashSet<>();
        for(int i = 0; i < candyType.length; i++){
            if(!nums.contains(candyType[i])){
                nums.add(candyType[i]);
                count++;
            }
        }return Math.min(count,candyType.length/2 );
    }
}