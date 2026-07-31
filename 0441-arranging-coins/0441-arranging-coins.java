class Solution {
    public int arrangeCoins(long n) {
   
   int f = (int)Math.floor((Math.sqrt(8*n+1)-1)/2);

   return f;
}
}