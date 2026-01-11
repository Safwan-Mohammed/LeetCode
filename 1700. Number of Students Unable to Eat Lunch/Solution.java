class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int oneCount = 0, zeroCount = 0;
        for(int num : students) {
            if(num == 1) oneCount++;
            else zeroCount++;    
        }

        for(int num : sandwiches){
            if( (num == 1 && oneCount == 0) || (num == 0 && zeroCount == 0) ) return Math.abs(oneCount - zeroCount);
            if(num == 1) oneCount--;
            else zeroCount--;
        }

        return Math.abs(oneCount - zeroCount);
    }
}