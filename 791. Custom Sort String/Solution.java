class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            int count = freq[order.charAt(i) - 'a'];
            while (count > 0) {
                sb.append(order.charAt(i));
                count--;
            }
            freq[order.charAt(i) - 'a'] = 0;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                int count = freq[i];
                while (count > 0) {
                    sb.append((char)('a' + i));
                    count--;
                }
            }
        }

        return sb.toString();
    }
}