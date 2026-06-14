class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(int i: nums){
            ans += encrypt(i);
        }
        return ans;
    }static int encrypt(int x){
        int max = 0;
        int size = 0;
        
        while(x > 0){
            size++;
            max = Math.max(max, x%10);
            x /= 10;
        }

        int ans = 0;
        while(size > 0){
            size--;
            ans = ans * 10 + max;
        }
        return ans;

    }
}