class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i: candies){
            max = Math.max(max, i);
        }
        List<Boolean> pillalu = new ArrayList<>();
        for(int i: candies){
            pillalu.add((i+extraCandies) >= max);
        }return pillalu;
    }
}