class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        int j=0;
        int k=nums.length-1;
        for( int i=0; i<nums.length-2; i++){
            j = i+1;
            k = nums.length-1;
            while( j<k ){
                if( nums[i]+nums[j]+nums[k] == 0 ){
                    List<Integer> triplet =Arrays.asList(nums[i],nums[j],nums[k]) ;
                    set.add(triplet);
                    j++;
                    k--;

                }
                else if( nums[i]+nums[j]+nums[k] > 0 ){
                     k--;
                }
                else {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);

        
    }
}
