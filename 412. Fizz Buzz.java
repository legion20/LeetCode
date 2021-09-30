class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
            if(i%3==0) {
                if(i%5==0)
                    l.add("FizzBuzz");
                else
                    l.add("Fizz");
            }
            else if(i%5 == 0)
                l.add("Buzz");
            else
                l.add(Integer.toString(i));
        }
        return l;
    }
}