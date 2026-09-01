class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers from array into set
        for(int num : nums) {
            set.add(num);
        }

        // Check numbers from 1 to n
        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}