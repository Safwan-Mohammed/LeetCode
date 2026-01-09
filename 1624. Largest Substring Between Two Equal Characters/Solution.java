class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idx = new int[26];
        char initialChar = s.charAt(0);
        int count = -1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != initialChar){
                if(idx[s.charAt(i) - 'a'] == 0) idx[s.charAt(i) - 'a'] = i;
                else count = Math.max(count, i - idx[s.charAt(i) - 'a'] - 1);
            }
            else count = Math.max(count, i - idx[s.charAt(i) - 'a'] - 1);
        }
        return count;
    }
}