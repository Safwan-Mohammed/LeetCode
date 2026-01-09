class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int max = -1;
        for(int num : nums){
            if(map.get(num) == 1) max = Math.max(max, num);
        }
        return max;
    }
}
