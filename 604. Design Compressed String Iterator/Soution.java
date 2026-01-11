class StringIterator {
    StringBuilder sb, numStr;
    char curr = ' ';
    int count = 0, idx = 0;
    public StringIterator(String compressedString) {
        sb = new StringBuilder(compressedString);
        computeStrAndCount();
    }
    
    private void computeStrAndCount(){
        curr = ' ';
        numStr = new StringBuilder();
        count = 0;
        while(idx < sb.length()){
            if(!(sb.charAt(idx) >= '0' && sb.charAt(idx) <= '9')) curr = sb.charAt(idx++);
            else {
                numStr.append(sb.charAt(idx++));
                if(!(sb.charAt(idx) >= '0' && sb.charAt(idx) <= '9')) break;
            }
        }
        count = Integer.parseInt(numStr.toString());
    }

    public char next() {
        if(count == 0) computeStrAndCount();
        count--;
        return curr;
    }
    
    public boolean hasNext() {
        return count > 0 || idx != sb.length();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
