class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, temp = 0;

        for(int i : nums){
            if(i == 1) temp++;
            else{
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        max = Math.max(max, temp);
        return max;
    }
}