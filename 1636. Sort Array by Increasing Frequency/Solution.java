class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            if(map.get(a) != map.get(b)) return map.get(a) - map.get(b);
            return b - a;
        });

        for(Integer num : map.keySet()) queue.offer(num);

        int[] res = new int[nums.length];
        int index = 0;
        while(!queue.isEmpty()){
            int key = queue.poll();
            int freq = map.get(key);
            for(int i = 0; i < freq; i++) res[index++] = key;
        }
        return res;
    }
}