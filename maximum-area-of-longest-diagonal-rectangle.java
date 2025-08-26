class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        for(int i = 0; i < dimensions.length; i++){
            max = Math.max(Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]), max);
        }
        int ans = 0;
        for(int i = 0; i < dimensions.length; i++){
            if(Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]) == max){
                ans =(int)Math.max(ans, dimensions[i][0]*dimensions[i][1]);
            }
        }return ans;
    }
}