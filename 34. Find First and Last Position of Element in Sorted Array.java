class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]--;
        arr[1]--;
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                arr[0] = mid;
            if(nums[mid]<target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        start = 0;
        end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                arr[1] = mid;
            if(nums[mid]<=target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr;
    }
}