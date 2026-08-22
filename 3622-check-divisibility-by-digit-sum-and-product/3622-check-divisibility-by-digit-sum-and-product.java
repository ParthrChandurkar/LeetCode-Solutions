class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int org = n;
        while(n>0){
            
            int digit = n % 10;
            n = n/10 ; 

            sum = sum + digit ;
            prod = prod*digit ;

        }
        return org % ( sum +prod)==0;
        
    }
}