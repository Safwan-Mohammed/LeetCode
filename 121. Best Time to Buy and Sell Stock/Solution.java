class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i : prices){
            if(minVal == Integer.MAX_VALUE) minVal = i;
            else{
                if(i < minVal) minVal = i;
                else maxProfit = Math.max(maxProfit, i - minVal);
            }
        }

        return maxProfit < 0 ? 0 : maxProfit;
    }
}