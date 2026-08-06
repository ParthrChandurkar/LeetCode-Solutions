class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            int original = i;
            int num = i;
            boolean ok = true;

            while (num > 0) {

                int digit = num % 10;

                if (digit == 0 || original % digit != 0) {
                    ok = false;
                    break;
                }

                num /= 10;
            }

            if (ok) {
                ans.add(original);
            }
        }

        return ans;
    }
}