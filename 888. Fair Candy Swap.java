class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0;
        for(int x: aliceSizes) sa+=x;
        for(int x: bobSizes) sb+=x;
        int y = (sb-sa)/2;

        Set<Integer> setbob = new HashSet();
        for(int x: bobSizes) setbob.add(x);

        for(int x: aliceSizes) {
            if(setbob.contains(x+y))
                return new int[]{x,x+y};
        }
        throw null;
    }
}