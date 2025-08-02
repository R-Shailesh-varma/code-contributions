class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length-1;
        while(i <= j){
            int min = Math.min(height[i], height[j]);
            int area = min*(j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i] == min){
                i++;
            }if(height[j] == min){
                j--;
            }
        }return maxArea;
    }
}