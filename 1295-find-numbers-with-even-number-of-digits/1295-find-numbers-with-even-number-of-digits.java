class Solution {
    public int findNumbers(int[] nums) {

        int num = 0;

        int count = 0;

        for(int i =0; i<nums.length;i++){
         num= nums[i];
         int digit =0;

         while(num>0){
            digit++;
            num = num/10;
        }
          if(digit%2==0){
            count++;        
        }
       
        }
       
    
        return count;
    }
}