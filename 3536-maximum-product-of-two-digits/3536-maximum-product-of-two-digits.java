class Solution {
    public int maxProduct(int n) {

        List<Integer> digits = new ArrayList<>();

        while(n > 0) {
            int digit = n % 10;
            digits.add(digit);
            n /= 10;
        }

        Collections.sort(digits);

        int largest = digits.get(digits.size() - 1);
        int second = digits.get(digits.size() - 2);

        return largest * second;
    }
}