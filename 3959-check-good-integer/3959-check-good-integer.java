class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;
        int digit = 0;
        int original = n;

        while(n>0){
            digit=n%10;
            dsum= dsum+digit;
            ssum=ssum + digit*digit;
            n=n/10;
        }
        
        return (ssum - dsum)>=50;
    }
}