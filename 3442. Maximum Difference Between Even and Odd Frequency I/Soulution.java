class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int evenFreq = Integer.MAX_VALUE;
        int oddFreq = Integer.MIN_VALUE;

        for (int i = 0; i < 26; i++) {
            int f = arr[i];
            if (f == 0) continue;

            if (f % 2 == 0) {
                evenFreq = Math.min(evenFreq, f);
            } else {
                oddFreq = Math.max(oddFreq, f);
            }
        }

        if (oddFreq == Integer.MIN_VALUE || evenFreq == Integer.MAX_VALUE) {
            return -1;
        }

        return oddFreq - evenFreq;
    }
}
