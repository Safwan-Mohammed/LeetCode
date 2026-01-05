class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, count = 1, ptr = -1;
        boolean flag = true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                if(ptr == -1){
                    flag = true;
                    count++;
                    ptr = 0;
                }else if(!flag) {
                    flag = true;
                    max = Math.max(max, count);
                    count = 2;
                }
                else count++;
            } else if(nums[i] < nums[i - 1]){
                if(ptr == -1){
                    flag = false;
                    count++;
                    ptr = 0;
                }else if(flag) {
                    flag = false;
                    max = Math.max(max, count);
                    count = 2;
                } else {
                    count++;
                }
            } else {
                max = Math.max(count, max);
                count = 1;
                ptr = -1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}