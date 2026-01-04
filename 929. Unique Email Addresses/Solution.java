class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str : emails){
            StringBuilder sb = new StringBuilder();
            String[] parts = str.split("@");

            for(int i = 0; i < parts[0].length(); i++){
                if(parts[0].charAt(i) == '+') break;
                if(parts[0].charAt(i) != '.') sb.append(parts[0].charAt(i));
            }
            sb.append('@');
            sb.append(parts[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}