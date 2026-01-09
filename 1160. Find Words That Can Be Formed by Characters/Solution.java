class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        int count = 0;
        for(int i = 0; i < chars.length(); i++) arr[chars.charAt(i) - 'a']++;
        int[] temp = Arrays.copyOf(arr, 26);
        for(String word : words){
            boolean flag = true;
            for(int i = 0; i < word.length(); i++){
                if(temp[word.charAt(i) - 'a'] == 0){
                    flag = false;
                    break;
                }
                temp[word.charAt(i) - 'a']--;
            }
            if(flag) count += word.length();
            temp = Arrays.copyOf(arr, 26);
        }
        return count;
    }
}