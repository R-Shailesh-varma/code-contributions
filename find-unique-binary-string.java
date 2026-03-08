class Solution {
    String ans;
    boolean flag;

    public String findDifferentBinaryString(String[] nums) {
        ans = "";
        flag = false;
        Set<String> given = new HashSet<>();

        for (String num : nums) {
            given.add(num);
        }

        generate(new StringBuilder(), nums[0].length(), given);
        return ans;
    }

    void generate(StringBuilder sb, int n, Set<String> given) {
        if (sb.length() == n) {
            if (!given.contains(sb.toString())) {
                ans = sb.toString();
                flag = true;
            }
            return;
        }

        int i = 0;
        while (!flag && i < 2) {
            sb.append((char)(i + '0'));
            generate(sb, n, given);
            sb.deleteCharAt(sb.length() - 1);
            i++;
        }
    }
}