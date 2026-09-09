class Solution {
    public int dominantIndex(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int largestIndex = -1;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                largestIndex = i;
            }
            else if(nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        if(largest >= 2 * secondLargest) {
            return largestIndex;
        }

        return -1;
    }
}