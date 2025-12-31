class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a') arr[0]++;
            if(text.charAt(i) == 'b') arr[1]++;
            if(text.charAt(i) == 'l') arr[2]++;
            if(text.charAt(i) == 'n') arr[3]++;
            if(text.charAt(i) == 'o') arr[4]++;
        }

        return Math.min(Math.min(arr[0], Math.min(arr[1], arr[3])), Math.min(arr[2]/2, arr[4]/2));
    }
}