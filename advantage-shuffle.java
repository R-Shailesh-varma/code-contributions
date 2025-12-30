class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int[] result = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            Integer key = map.higherKey(nums2[i]);
            if (key == null) {
                key = map.firstKey();
            }
            result[i] = key;
            map.put(key, map.get(key) - 1);
            if (map.get(key) == 0) {
                map.remove(key);
            }
        }
        return result;
    }
}
