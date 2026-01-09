class Solution {
    public int maxScore(String s) {
        
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];

        left[0] = s.charAt(0) == '0' ? 1 : 0;
        right[s.length() - 1] = s.charAt(s.length()-1) == '1' ? 1 : 0;

        for(int i = 1 ; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                left[i] += 1;
            }
            left[i] += left[i-1];
        }

        for(int i = s.length() - 2 ; i > -1; i--){
            if(s.charAt(i) == '1'){
                right[i] += 1;
            }
            right[i] += right[i+1];
        }

        int max = -1;

        for(int i = 0 ; i < s.length() - 1; i++)
            max = Math.max(right[i+1] + left[i], max);
        return max;

    }
}