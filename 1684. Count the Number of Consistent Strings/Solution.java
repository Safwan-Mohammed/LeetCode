class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        int count = 0;
        for(int i = 0; i < allowed.length(); i++) arr[allowed.charAt(i) - 'a'] = true;

        for(String str : words){
            for(int i = 0; i < str.length(); i++){
                if(!arr[str.charAt(i) - 'a']) break;
                if(i == str.length() - 1) count++;
            }
        }
        return count;
    }
}