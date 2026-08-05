class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int d = arr[1]-arr[0] ;
        int m = arr.length;

        for(int i=0 ; i<m-1;i++){
            int temp = arr[i+1] - arr[i];

            if(temp != d) return false ;

        }
        return true ;
    }
}