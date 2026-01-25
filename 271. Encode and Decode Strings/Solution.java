class Solution {

    public String encode(List<String> strs) {
        List<Integer> length = new ArrayList<>();
        for(String str : strs) length.add(str.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length.size(); i++){
            sb.append(length.get(i));
            if(i != length.size() - 1) sb.append(",");
        }
        sb.append("#");

        for(String str : strs) sb.append(str);
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<Integer> length = new ArrayList<>();
        List<String> res = new ArrayList<>();
        if(str.length() == 1) return res;
        int next = 0;
        int prev = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                length.add(Integer.parseInt(str.substring(prev, i)));
                next = i + 1;
                break;
            }

            if(str.charAt(i) == ','){
                length.add(Integer.parseInt(str.substring(prev, i)));
                prev = i + 1;
            }
        }
        for(int i = 0; i < length.size(); i++){
            int count = length.get(i);
            if(count == 0) res.add(new String(""));
            else {
                res.add(str.substring(next, next + count));
                next = next + count;
            }
        }
        return res;
    }
}
