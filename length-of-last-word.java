class Solution {
    public int lengthOfLastWord(String s) {
        String[] ns = s.trim().split("\\s+");
        return ns[ns.length - 1].length();
    }
}