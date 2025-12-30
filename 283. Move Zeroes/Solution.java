class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0)
                nums[idx++] = nums[j];
        }

        for(int i = idx; i < nums.length; i++) nums[i] = 0;
    }
}