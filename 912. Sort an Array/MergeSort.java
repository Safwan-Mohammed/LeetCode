class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int start, int end){
        if(end <= start) return;
        int mid = ( start + end ) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end){
        List<Integer> arr = new ArrayList<>();
        int i = start, j = mid + 1;

        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]) arr.add(nums[i++]);
            else arr.add(nums[j++]);
        }

        while(i <= mid) arr.add(nums[i++]);
        while(j <= end) arr.add(nums[j++]);

        for(i = start; i <= end; i++) nums[i] = arr.get(i - start);
    }
}