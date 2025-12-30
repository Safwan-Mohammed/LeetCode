class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = (nums.length * (nums.length + 1)) / 2;

        for(int i : nums) totalSum -= i;

        return totalSum;
    }
}