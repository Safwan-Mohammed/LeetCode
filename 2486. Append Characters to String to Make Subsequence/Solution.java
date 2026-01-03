class Solution {
    public int appendCharacters(String s, String t) {
        int idx1 = 0, idx2 = 0;

        while(idx1 < s.length()){
            if(idx2 == t.length()) return 0;
            if(s.charAt(idx1) == t.charAt(idx2))
                idx2++;
            idx1++;
        }

        return t.length() - idx2;
    }
}