class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int count[] = new int[spells.length];
        for(int i = 0; i < spells.length; i++){
            count[i] = strength(spells[i], potions, success);
        }return count;
    }private int strength(long num, int[] potions, long ans){
        int low = 0;
        int high = potions.length-1;
        int res = potions.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(potions[mid]*num >= ans){
                high = mid-1;
                res = mid;
            }else{
                low = mid+1;
            }
        }return potions.length-res;
    }
}