class Solution {
    public int specialArray(int[] nums) {
        int x = nums.length;
        int arr[] = new int[x+1];
        for(int num: nums) {
            if(num>=x)
                arr[x]++;
            else
                arr[num]++;
        }
        int sum=0;
        for(int i=x; i>=0; i--) {
            sum+=arr[i];
            if(sum==i)
                return i;
        }
        return -1;
    }
}