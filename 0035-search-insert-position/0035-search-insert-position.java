class Solution {
    public int searchInsert(int[] nums, int target) {

        int output = 0;

        if(target<nums[0]){
                output = 0;
        }else if(target>nums[nums.length -1 ]){
            output = nums.length;
        }    
            
        for(int i = 0 ; i<nums.length;i++){
            
            if(nums[i]==target){
                output = i;
                break;
            }else if ( i < nums.length - 1 &&target > nums[i] && target<nums[i+1]){
                output =  i+1;
            }
        }
        return output;
              
    }
}
