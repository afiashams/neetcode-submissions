class Solution {
    public int[] twoSum(int[] numbers, int target) {

        
        int r=(numbers.length)-1;
        int i=0;
        while( i < r ){

           
            if(  numbers[i] + numbers[r] == target ){
                return new int[]{++i,++r};
            }
            else if( numbers[i] + numbers[r] > target ){
                r--;

            }
            else if( numbers[i] + numbers[r] < target ){
                i++;
            }
        }
        return new int[]{};
        
    }
}
