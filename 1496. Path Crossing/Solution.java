class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair> set = new HashSet<>();

        Pair currPoint = new Pair(0, 0);
        set.add(currPoint);

        for(int i = 0; i < path.length(); i++){
            int left = currPoint.getLeft();
            int right = currPoint.getRight();
            if(path.charAt(i) == 'N') left++;
            else if(path.charAt(i) == 'S') left--;
            else if(path.charAt(i) == 'E') right++;
            else right--;

            Pair newPair = new Pair(left, right);
            if(set.contains(newPair)) return true;
            set.add(newPair);
            currPoint = newPair;
        }
        return false;
    }

    class Pair{
        private int left;
        private int right;

        Pair(int left, int right){
            this.left = left;
            this.right = right;
        }

        public int getLeft(){
            return this.left;
        }

        public int getRight(){
            return this.right;
        }

        public boolean equals(Object o){
            if(this == o) return true;
            Pair p = (Pair) o;
            return this.left == p.left && this.right == p.right;
        }

        public int hashCode(){
            return Objects.hash(this.left, this.right);
        }
    }
}