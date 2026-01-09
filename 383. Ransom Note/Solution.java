class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] avail = new int[26];

        for(int i = 0; i < magazine.length(); i++) avail[magazine.charAt(i) - 'a']++;

        for(int i = 0; i < ransomNote.length(); i++){
            if(avail[ransomNote.charAt(i) - 'a'] == 0) return false;
            avail[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}