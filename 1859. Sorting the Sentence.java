/*
In order to Solve this Problem, I am first finding out when is the space occuring in the String s
After we find out the Space, we then check the number just before the space and put the substring from the counter variable to space-1
Also, in the last substring we won't we see any space so that's why I have also done a check for last index.
After that, The index at which we are storing the Substring is in a predefined array of size 10 because in the problem its mentioned that there can be only 9 words
Also we are subtracting 48 from the storing index because it is a string and ASCII value of integer start from 48
After getting all the substring in the array, we put append all the Substring from array to the String Builder

*/


class Solution {
    public String sortSentence(String s) {
        String[] arr = new String[10];
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                arr[s.charAt(i-1) - 1 - 48] = s.substring(count,i-1);
                count = i+1;
            }
            else if(i == s.length() - 1) {
                arr[s.charAt(i) - 1 - 48] = s.substring(count,i);
            }
        }
        count=0;
        StringBuilder sb = new StringBuilder();
        while(arr[count]!=null) {
            sb.append(arr[count]);
            sb.append(" ");
            count++;
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}