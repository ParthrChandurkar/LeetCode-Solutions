class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] news = new int[2*nums.length];

        for(int i=0;i<nums.length;i++){
            news[i]=nums[i];

            news[i+ nums.length] = news[i];


        }
        return news;
        }
        
    }