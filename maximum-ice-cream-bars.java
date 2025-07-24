class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int i: costs){
            coins -= i;
            if(coins < 0){
                return count;
            }count++;
        }return count;
    }
}