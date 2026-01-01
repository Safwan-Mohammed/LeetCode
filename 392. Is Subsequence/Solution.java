class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx1 = 0, idx2 = 0;

        while(idx2 < t.length()){
            if(idx1 >= s.length()) break;
            if(s.charAt(idx1) == t.charAt(idx2))
                idx1++;
            idx2++;
        }a
        return idx1 == s.length(); 
    }

}