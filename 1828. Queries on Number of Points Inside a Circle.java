/*
In order to Solve this Problem, I have used the Formula for getting the Distance between 2 points on a 2D plane.
If the distance between the center and the points is less than or equal to the radius then it will increment our counter variable

Formula => Radius*Radius = (x2-x1)^2 + (y2-y1)^2
*/


class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int c=0;
            int x = queries[i][2]*queries[i][2];
            int y1 = queries[i][0];
            int z1 = queries[i][1];
            for(int j=0; j<points.length; j++) {
                int y = (y1 - points[j][0]);
                int z = (z1 - points[j][1]);
                if(Math.abs((y*y) + (z*z)) <= x)
                    c++;
            }
            arr[i] = c;
        }
        return arr;
    }
}