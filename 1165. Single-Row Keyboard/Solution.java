class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] idx = new int[26];

        for(int i = 0; i < keyboard.length(); i++) idx[keyboard.charAt(i) - 'a'] = i;

        char curr = keyboard.charAt(0);
        int time = 0;
        for(int i = 0; i < word.length(); i++){
            time += Math.abs(idx[curr - 'a'] - idx[word.charAt(i) - 'a']);
            curr = word.charAt(i);
        }
        return time;
    }
}
