class Solution {
    public String stringShift(String s, int[][] shift) {
        int netDisplacement = 0;

        for(int[] arr : shift){
            if(arr[0] == 1) netDisplacement += arr[1];
            if(arr[0] == 0) netDisplacement -= arr[1];
        }
        System.out.println(netDisplacement);
        netDisplacement %= s.length();
        System.out.println(netDisplacement);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            int idx = (i + netDisplacement) % s.length();
            if(idx < 0) idx += s.length() ; 
            sb.setCharAt(idx, s.charAt(i));
        }
        return sb.toString();
    }
}
