class Solution {
    public String largestGoodInteger(String num) {
        int val = -1;
        String res = "";
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)){
                if(Integer.parseInt(num.substring(i, i + 3)) > val) {
                    res = num.substring(i, i + 3);
                    val = Integer.parseInt(res);
                } 
            }
        }
        return res;
    }
}