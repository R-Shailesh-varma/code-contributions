class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        boolean oneChance = true;
        while(i < j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrome(s, i, j-1) || isPalindrome(s, i+1, j);
            }
        }return true;   
    }

    private static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}