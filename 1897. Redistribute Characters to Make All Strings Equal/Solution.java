class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        int n = words.length;
        for(String str : words){
            for(int i = 0; i < str.length(); i++) freq[str.charAt(i) - 'a']++;
        }
        for(int num : freq) if(num % n != 0) return false;
        return true;
    }
}