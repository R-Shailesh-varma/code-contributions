class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int Ls = 0;
        int Rs = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                Ls++;
            }else if(s.charAt(i) == 'R'){
                Rs++;
            }if(Ls > 0 && Rs > 0 && Ls == Rs){
                count++;
                Ls = 0;
                Rs = 0;
            }
        }return count;
    }
}