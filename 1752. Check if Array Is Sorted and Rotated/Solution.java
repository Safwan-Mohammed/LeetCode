class Solution {
    public boolean check(int[] nums) {
        int descCount = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]) descCount++;
        }

        if(nums[nums.length - 1] > nums[0]) descCount++;

        return descCount <= 1;
    }
}