class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int i : nums){
            if(map.containsKey(i)){
                int freq = map.get(i);
                count += (freq * (freq - 1)) / 2;
                map.remove(i);
            }
        }
        return count;
    }
}