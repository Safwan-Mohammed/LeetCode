class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for(int i : nums) rightSum += i;

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                leftSum = 0;
                rightSum -= nums[i];
            }
            else if(i == nums.length - 1){
                rightSum = 0;
                leftSum += nums[i - 1];
            }
            else{
                rightSum -= nums[i];
                leftSum += nums[i-1];
            }

            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}