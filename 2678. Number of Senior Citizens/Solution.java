class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String str : details){
            StringBuilder sb = new StringBuilder(str);
            int age = Integer.parseInt(sb.substring(11, 13));
            if(age > 60) count++;
        }

        return count;
    }
}