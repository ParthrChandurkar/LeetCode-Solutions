class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        long start=1;
        long end =2;
        long range=2;

        while(n<start || n>end){
            row++;
            start=end+1;
            range++;
            end=start+range-1;
        }
        return row;
    }
}