class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();

        for(int i : nums) set.add(i);
        int len = 1;
        for(int num : set){
            if(!set.contains(num - 1)){
                int count = 1;
                int x = num + 1;
                while(set.contains(x)){
                    count++;
                    x++;
                }
                len = Math.max(len, count);
            }
        }
        return len;
    }
}