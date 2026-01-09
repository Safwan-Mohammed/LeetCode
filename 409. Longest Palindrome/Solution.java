class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        boolean oddOcc = false;
        int count = 0;
        for(int val : map.values()){
            if(val % 2 == 0) count += val;
            else{
                if(oddOcc){
                    count = count + val - 1;
                }
                else{
                    count += val;
                    oddOcc = true;
                }
            }
        }

        return count;
    }
}