class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        int max = -1;
        for(int num : arr) count[num]++;
        for(int num : arr) if(num == count[num]) max = Math.max(max, num);
        return max;
    }
}