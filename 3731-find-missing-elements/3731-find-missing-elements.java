class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        List<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            } else if (nums[i] < smallest) {
                smallest = nums[i];
            }

        }
        for (int i = smallest; i <= largest; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                remaining.add(i);
            }
        }
        return remaining;
    }
}