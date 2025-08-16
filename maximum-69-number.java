class Solution {
    public int maximum69Number (int num) {
        StringBuilder Snum = new StringBuilder(String.valueOf(num));
        for(int i = 0; i < Snum.length(); i++){
            if(Snum.charAt(i) == '6'){
                Snum.replace(i,i+1,"9");
                break;
            }
        }return Integer.parseInt(Snum.toString());
    }
}