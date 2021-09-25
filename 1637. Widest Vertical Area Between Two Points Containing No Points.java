/*
In order to solve this Problem, I have used the normal Brute-Force Approach which was faster than 99.55% of Solutions
As we only want the maximum width and the length is infinte so we are going to ignore the y-axis which is the length
and we store the x axis cordinates in a new array. After that I sort the new array
After sorting we simply go through the array one time and return the maximum difference between 2 continuous points
*/


class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        for(int i=0; i<points.length; i++)
            arr[i] = points[i][0];
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<points.length-1; i++) {
            if((arr[i+1] - arr[i]) > max)
                max = (arr[i+1] - arr[i]);
        }
        return max;
    }
}