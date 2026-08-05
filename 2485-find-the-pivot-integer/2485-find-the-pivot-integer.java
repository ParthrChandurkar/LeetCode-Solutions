class Solution {
    public int pivotInteger(int n) {

    int left= 0;

    int right = n*(n+1)/2;



    for( int i =1 ; i <= n ; i++ ){

        left = left + i ;

        right = right - i + 1 ;

        if(left ==right ) return i ;
    }
    return -1 ;
    }
}