class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;
        
        int original = x;
        int rev  = 0 ;
      
        int n ;

        while(x>0){
        n = x%10;
        rev = 10*rev + n ;
        x = x/10;


        }
       return rev == original ;
        }
        
    }
