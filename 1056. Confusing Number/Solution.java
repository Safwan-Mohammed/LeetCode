class Solution {
    public boolean confusingNumber(int n) {
        Map<Integer, Integer> invert = new HashMap<>();
        invert.put(0, 0);
        invert.put(1, 1);
        invert.put(6, 9);
        invert.put(8, 8);
        invert.put(9, 6);
        int oldNum = n;
        int newNum = 0;

        while(n != 0){
            int q = n % 10;
            if(!invert.containsKey(q)) return false;
            newNum = ( newNum * 10 ) + invert.get(q);
            n /= 10;
        }

        return newNum != oldNum;
    }
}
