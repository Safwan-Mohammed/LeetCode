class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    sum += grid[i][j];
                }
                else res[0] = grid[i][j];
            }
        }
        int n = grid.length * grid.length;
        res[1] = ((n *(n + 1)) / 2) - sum;
        return res;
    }
}