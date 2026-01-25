class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];

        int ballsToRight = 0, movesToRight = 0, ballsToLeft = 0, movesToLeft = 0;

        for(int i = 0; i < boxes.length(); i++){
            res[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;

            int j = boxes.length() - 1 - i;

            res[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }
        return res;
    }
}