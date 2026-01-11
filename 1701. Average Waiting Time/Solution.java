class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalTime = 0;
        int currTime = -1;
        
        for(int[] cust : customers){
            if(currTime < cust[0]) currTime = cust[0];
            currTime += cust[1];
            totalTime += (currTime - cust[0]);
        }

        return totalTime / customers.length;
    }
}