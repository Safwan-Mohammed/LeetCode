class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length + 1];
        int[] res = new int[queries.length];
        prefix[0] = 0;

        for(int i = 0; i < words.length; i++){
            int len = words[i].length();
            int curr = isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(len - 1)) ? 1 : 0;
            prefix[i + 1] = prefix[i] + curr;
        }

        for(int i = 0; i < queries.length; i++){
            res[i] = prefix[queries[i][1] + 1] - prefix[queries[i][0]];
        }

        return res;
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}