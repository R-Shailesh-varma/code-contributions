class Solution {
    public String triangleType(int[] n) {
        
        if(helper(n)){    
            if(n[0] == n[1] && n[1] == n[2]) return "equilateral";
            else if(n[0] == n[1] || n[1] == n[2] || n[2] == n[0]) return "isosceles";
            else return "scalene";
        }   
        
        return "none";
    }public boolean helper(int[] t){
        return (t[0] + t[1] > t[2] && t[0] + t[2] > t[1] && t[2] + t[1] > t[0]);
    }
}