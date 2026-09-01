class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        boolean[] present = new boolean[n + 1];

        for(int num : nums) {
            present[num] = true;
        }

        for(int i = 1; i <= n; i++) {
            if(!present[i]) {
                result.add(i);
            }
        }

        return result;
    }
}