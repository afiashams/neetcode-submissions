class Solution {
    public int search(int[] nums, int target) {

       
       

        int start = 0 ;
        int end = nums.length-1;
        int result = -1;
        int currentLength = nums.length;
       
        int i=0;
            System.out.println("start >> "+start);
        while(start <= end){
        int mid = start + (end - start) / 2;         
            if( nums[mid] == target ){
                return mid;
            }
            else if (nums[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1;   // Search the left half
            }


        }

        return result;

        
    }
}
