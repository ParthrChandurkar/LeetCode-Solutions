class Solution {
    public int sumOfSquares(int[] arr) {
        int result=0;
        for (int i = 1; i <= arr.length; i++) {
            if (arr.length % i == 0) {
                result = result + (arr[i - 1] * arr[i - 1]);
            }
        }
        return result;
    }
}