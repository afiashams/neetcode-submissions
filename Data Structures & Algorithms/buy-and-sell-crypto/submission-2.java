class Solution{
	public int maxProfit( int[] nums){
		int length = nums.length;
		int maxProfit = 0;
		int minPrice = nums[0];
		for( int i=1;i<length; i++){
			minPrice = Math.min(minPrice, nums[i]);
			maxProfit = Math.max(maxProfit, nums[i] - minPrice);
}
return maxProfit;
} 
}
