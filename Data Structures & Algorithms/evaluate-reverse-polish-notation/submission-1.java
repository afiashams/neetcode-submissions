class Solution {
   public int evalRPN(String[] tokens){
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        if(tokens.length == 0 ){
            return -1;
        }
        int val1=0, val2=0;
        for( String s : tokens){	
            if(  s.equals("+") ||  s.equals('+') ){
                val2 = stack.pop();
                val1 = stack.pop();
                stack.push( val1 + val2 );
            }
            else if(  s.equals("-") ||  s.equals('-') ){

                    val2 = stack.pop();
                    val1 = stack.pop();
                    stack.push( val1 - val2 );
            }
            else if(  s.equals("/") ||  s.equals('/') ){

                val2 = stack.pop();
                val1 =stack.pop();
                stack.push( val1 / val2 );

            }
            else if(  s.equals("*") ||  s.equals('*') ){

                val2 = stack.pop();
                val1 = stack.pop();
                stack.push( val1 * val2 );

            }
            else {
                stack.push( Integer.parseInt(s));
            }
           	
        }
        result = stack.peek();
        stack.clear();
        return result;
    }

}
