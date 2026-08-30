class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        int n = temperatures.length;
        Stack<Integer> stack = new Stack();
        for( int i= n-1; i>=0; i-- ){
            int days = 0;
            if(stack.size() == 0 ){
                result[i] = 0;
            }
            while( stack.size() > 0 ){

                if( temperatures[stack.peek()] > temperatures[i]  ){
                    result[i] = stack.peek() - i;
                    break;
                }
                else{
                    days++;
                    stack.pop();
                }
            }
           
            stack.push(i);
        } 
        return result;
    }
}
