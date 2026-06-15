class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int c1 = 0;
        int c2 = 0;
        for(int i: nums1){
            s1.add(i);
        }
        
        for(int i: nums2){
            s2.add(i);
            if(s1.contains(i)) c2++;
        }

        for(int i: nums1){
            if(s2.contains(i)) c1++;
        }

        return new int[]{c1, c2};
    }
}