class Solution {
    public int[] replaceElements(int[] arr) {
        int grt = -1, temp = 0;

        for(int i = arr.length - 1; i >= 0; i--){
            temp = arr[i];
            arr[i] = grt;
            grt = Math.max(grt, temp);
        }

        return arr;
    }
}