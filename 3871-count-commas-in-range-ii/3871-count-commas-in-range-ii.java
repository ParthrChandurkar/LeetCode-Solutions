class Solution { 
    public long countCommas(long n) { 
         
        long output = 0;

        if(n < 1000) { 
            output = 0; 

        } else if(n < 1000000) {     
            output = n - 999; 

        } else if(n < 1000000000) {   
            output = 999000L + 2 * (n - 999999); 

        } else if(n < 1000000000000L) { 
            output = 999000L 
                   + 1998000000L 
                   + 3 * (n - 999999999L); 

        } else if(n < 1000000000000000L) {  
            output = 999000L 
                   + 1998000000L 
                   + 2997000000000L 
                   + 4 * (n - 999999999999L);  

        } else if(n == 1000000000000000L) { 
            output = 999000L 
                   + 1998000000L 
                   + 2997000000000L 
                   + 4 * (n - 999999999999L) 
                   + 1; 
        }

        return output; 
    } 
}