class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        int count = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(needle.charAt(0) == haystack.charAt(i)){
                count = 1;
                for(int j = 1; j < needle.length(); j++){
                    if((i + j) >= haystack.length()) break;
                    if(needle.charAt(j) == haystack.charAt(i + j)) count++;
                    else break; 
                }
                if(count == needle.length()) return i;
            }
        }
        return -1;
    }
}