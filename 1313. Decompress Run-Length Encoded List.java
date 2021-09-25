/*
In order to Solve this Problem, first i am calculating the size of the result array which we are going to return
To get the size, we add all the integers at odd places because they are the Frequency
After that we also have an start index for filling the result array with values
We use here Arrays Class Fill Method to fill the array with a value upto frquency times
You can also use the Normal method to fill my using a for loop inside the main loop but it takes more runtime and less storage
and Arrays. fill takes less runtime but more storage
*/


class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n =0;
        for(int i=0; i<nums.length; i+=2) {
            n+=nums[i];
        }
        int[] a = new int[n];
        int st = 0;
        for(int i=0; i<nums.length; i+=2) {
            Arrays.fill(a, st, st + nums[i], nums[i + 1]);
            st += nums[i];
        }
        return a;
    }
}