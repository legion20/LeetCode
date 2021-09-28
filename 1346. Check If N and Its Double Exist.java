class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s = new HashSet<Integer>();
        for(int num: arr) {
            if(s.contains(2*num) || (num%2==0 && s.contains(num/2)))
                return true;
            s.add(num);
        }
        return false;
    }
}