class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;
        int digit = 0;
        int original = n;

        while(n>0){
            digit=n%10;
            dsum= dsum+digit;
            n=n/10;
        }
        while(original>0){
            digit=original%10;
            ssum=ssum + digit*digit;
            original/=10;
        }
        return (ssum - dsum)>=50;
    }
}