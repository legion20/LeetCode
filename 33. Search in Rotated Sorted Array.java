class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int peak = -1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                peak = mid;
                break;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                peak = mid-1;
                break;
            }
            if(nums[mid] > nums[start])
                start = mid+1;
            else
                end = mid-1;
        }
        if(peak==-1){
            start = 0;
            end = nums.length-1;
            while(start<=end) {
                int mid = start + (end-start)/2;
                if(nums[mid]==target)
                    return mid;
                else if(nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        else if(target<nums[0]){
            start = peak+1;
            end = nums.length-1;
            while(start<=end) {
                int mid = start + (end-start)/2;
                if(nums[mid]==target)
                    return mid;
                else if(nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        else {
            start = 0;
            end = peak;
            while(start<=end) {
                int mid = start + (end-start)/2;
                if(nums[mid]==target)
                    return mid;
                else if(nums[mid]>target)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }
};