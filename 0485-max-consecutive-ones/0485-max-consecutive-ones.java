class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int n=nums.length;
        int count=0;
        int max =0;

        while(m<n){
            if(nums[m]==0){
                m++;
                count=0;
            }else if(nums[m]==1){
                count++;
                m++;
                max=Math.max(max,count);
            }
        }
    return max;    
    }
}