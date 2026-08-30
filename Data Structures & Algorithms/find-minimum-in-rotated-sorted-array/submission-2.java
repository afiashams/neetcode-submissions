class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid = start + ( end-start)/2;
        int min = nums[mid];
        while ( start <= end  ){
            mid = start + ( end-start)/2;
            //check if right array is sorted or not
            if( nums[mid] < nums[end]){
                if( min > nums[mid] ){
                    min = nums[mid];
                }
                end = mid-1;
            }
            //check if left array is sorted or not
            else {
                 if( min > nums[start] ){
                    min = nums[start];
                }
                start = mid+1;
            }
        }
        return min;
        
    }
}
