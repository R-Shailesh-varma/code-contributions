class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;
        for(int i = 0; i < nums.length; i++){
            if(prev == -1 && nums[i] == 1){
                prev = i;
                continue;
            }else if(nums[i] == 1){
                int dist = i - prev - 1;
                System.out.println(prev + " "+ i);
                if(dist < k) return false; 
                prev = i;
            }
        }
        return true;
        // int c=1;
        // int n=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         if(c<1){
        //             continue;
        //         }
        //         else if(c>1 && n>=k){
        //             n=0;
        //         }
        //         else if(n<k){
        //             return false;
        //         }
        //     }
        //     else
        //     {
        //         n++;
        // }
        // }
        // return true;
    }
}