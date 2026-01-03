class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sb = new String(arr);
            if(!map.containsKey(sb)) map.put(sb, new ArrayList<>());
            map.get(sb).add(word);
        }

        return new ArrayList<>(map.values());
    }
}