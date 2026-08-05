class Solution {
    public int[] plusOne(int[] given) {

       int m = given.length;

        for(int i = m-1 ; i>=0 ; i--){
            if(given[i] != 9 ){
                given[i]++;

                return given; 
            }
            else{
                given[i] = 0 ;
            
            }
        }

        int[] ans = new int[m + 1];
        ans[0] = 1;
        
        return ans;
    }
}