class Solution {
    public int addDigits(int num) {

        while (num >= 10) {      // Repeat until only one digit remains
            int sum = 0;

            while (num > 0) {    // Add all digits
                sum += num % 10;
                num /= 10;
            }

            num = sum;           // Use the sum for the next iteration
        }

        return num;
    }
}