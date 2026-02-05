class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int newIdx = ( i + nums[i] ) % nums.length;
            res[i] = newIdx >= 0 ? nums[newIdx] : nums[nums.length + newIdx];
        }
        return res;
    }
}