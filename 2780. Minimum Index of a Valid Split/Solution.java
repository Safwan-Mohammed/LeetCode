class Solution {
    public int minimumIndex(List<Integer> nums) {
        int ele = nums.get(0);
        int count = 1;

        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) != ele){
                if(count == 1) ele = nums.get(i);
                else count--;
            }
            else count++;
        }
        count = 0;
        for(Integer num : nums) if(num == ele) count++;
        int leftCount = 0;
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) == ele){
                count--;
                leftCount++;
            }
            if( (leftCount > (i + 1) / 2) && (count > (nums.size() - i - 1) / 2) )
                return i;
        }
        return -1;
    }
}