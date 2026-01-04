class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, max = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                count++;
                max = nums[i];
            }
            else{
                if(nums[i] == max) count++;
                else{
                    if(count == 0){
                        max = nums[i];
                        count++;
                    }
                    count--;
                }
            }
        }
        return max;
    }
}