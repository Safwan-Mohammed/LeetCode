class Solution {
    public boolean canPermutePalindrome(String s) {
        boolean oddOcc = false;
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                if(freq[i] % 2 != 0){
                    if(oddOcc) return false;
                    oddOcc = true;
                }
            }
        }
        return true;
    }
}
