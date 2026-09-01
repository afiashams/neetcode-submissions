class Solution { 
    public int[] getConcatenation(int[] nums) {
	int numlength=nums.length;
	int[] result = new int[numlength*2];
        	for( int i=0; i< nums.length ;i++){
		result[i] = nums[i];
		result[i+numlength] = nums[i];
}
	
        return result;
    }
}

