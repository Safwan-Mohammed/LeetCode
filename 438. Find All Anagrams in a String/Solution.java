class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if(p.length() > s.length()) return list;

        int[] pattern = new int[26];
        int[] chars = new int[26];

        for(int i = 0; i < p.length(); i++) pattern[p.charAt(i) - 'a']++;
        int i = 0, j = 0;

        while(j < s.length()){
            if(j - i < p.length()) chars[s.charAt(j++) - 'a']++;
            else{
                if(Arrays.equals(chars, pattern)){
                    list.add(i);
                }
                chars[s.charAt(i++) - 'a']--;
                chars[s.charAt(j++) - 'a']++;
            }
        }
        if(Arrays.equals(chars, pattern)) list.add(i);
        return list;
    }
}