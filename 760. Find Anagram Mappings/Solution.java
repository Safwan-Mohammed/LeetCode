class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            List<Integer> list;
            if(!map.containsKey(nums2[i])){
                list = new ArrayList<>();
                list.add(i);
                map.put(nums2[i], list);
            }
            else{
                list = map.get(nums2[i]);
                list.add(i);
                map.put(nums2[i], list);
            }
        }

        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            int n = nums1[i];
            res[i] = map.get(n).get(0);
            if(map.get(n).size() > 1) map.get(n).remove(0);
            else map.remove(n);
        }
        return res;
    }
}
