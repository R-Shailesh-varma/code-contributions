class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == 'x' && b == 'y') xy++;
            else if (a == 'y' && b == 'x') yx++;
        }

        // If total mismatches are odd, we can't fix them
        if ((xy + yx) % 2 != 0) return -1;

        // Each pair of xy or yx contributes 1 swap
        // Remaining one xy and one yx need 2 swaps
        return (xy / 2) + (yx / 2) + (xy % 2) * 2;
    }
}
