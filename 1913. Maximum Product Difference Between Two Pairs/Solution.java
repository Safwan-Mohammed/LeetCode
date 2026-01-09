class Solution {
    public int maxProductDifference(int[] nums) {
        int big1 = nums[0], big2 = nums[1], small1 = nums[0], small2 = nums[1];

        for(int i = 1; i < nums.length; i++){
            int n = nums[i];

            if(big1 > nums[i]){
                big2 = big1;
                big1 = nums[i];
            } else if(big1 == nums[i] || big2 > nums[i]) big2 = nums[i];

            if(small1 < nums[i]){
                small2 = small1;
                small1 = nums[i];
            } else if(small1 == nums[i] || small2 < nums[i]) small2 = nums[i];
        }

        return Math.abs((big1 * big2) - (small1 * small2));
    }
}