class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) return false;
        Map<String, Set<String>> map = new HashMap<>();
        
        for(List<String> list : similarPairs){
            map.computeIfAbsent(list.get(0), k -> new HashSet<String>()).add(list.get(1));
            map.computeIfAbsent(list.get(1), k -> new HashSet<String>()).add(list.get(0));
        }

        for(int i = 0; i < sentence1.length; i++){
            if(sentence1[i].equals(sentence2[i])) continue;
            if(!map.containsKey(sentence1[i])) return false;
            if(!map.get(sentence1[i]).contains(sentence2[i])) return false;
        }
        return true;
    }
}
