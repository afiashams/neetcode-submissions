class Solution{

	public int[] replaceElements( int[] arr){
		int[] result =new int[arr.length];
		Stack<Integer> stack = new Stack();
		result[arr.length-1] = -1;
        int n=arr.length;
		for( int i=n-1; i>=0;i--){
			if( stack.size() == 0   ){
                stack.push(arr[i]);
                result[i] = -1;

            }
            else{
                result[i] = stack.peek();

            }
            if(stack.peek() < arr[i]){
                stack.push(arr[i]);

            }


        }
                


		return result;
}
}
