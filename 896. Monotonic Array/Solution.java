class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag = -1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) continue;

            if(nums[i] < nums[i + 1]){
                if(flag == -1) flag = 1;
                else if(flag == 0) return false;
            }
            else{
                if(flag == -1) flag = 0;
                else if(flag == 1) return false;
            }
        }
        return true;
    }
}