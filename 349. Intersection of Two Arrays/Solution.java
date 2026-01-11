class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        int[] smaller = nums1.length < nums2.length ? nums1 : nums2;
        int[] larger  = nums1.length < nums2.length ? nums2 : nums1;

        for (int n : smaller) set.add(n);
        for (int n : larger) if (set.contains(n)) resSet.add(n);

        int[] res = new int[resSet.size()];
        int i = 0;
        for (int n : resSet) res[i++] = n;

        return res;
    }
}
