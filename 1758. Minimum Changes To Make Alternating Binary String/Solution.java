class Solution {
    public int minOperations(String s) {
        if(s.length() == 1) return 0;
        int count = 0, temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '0') count++;
                else temp++;
            }
            else{
                if(s.charAt(i) == '1') count++;
                else temp++;
            }
        }
        return temp < count ? temp : count;
    }
}