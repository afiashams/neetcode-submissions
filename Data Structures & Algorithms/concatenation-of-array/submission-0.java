class Solution { 
    public int[] getConcatenation(int[] nums) {
    int length= 2*(nums.length);
	int[] result = new int[length];
    int i=0;
        	for( i=0; i< nums.length ;i++){
		result[i] = nums[i];
}
int j=i;
	for( i=0; i< nums.length ;i++){
		result[j] = nums[i];
        j++;
}

        return result;
    }
}

