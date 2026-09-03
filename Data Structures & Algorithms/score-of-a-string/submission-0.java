class Solution{

	public int scoreOfString( String s) {

		int result = 0;
		char[] stringArray = new char[s.length()];
 stringArray = s.toCharArray();
		for( int i=0;  i<s.length()-1 ;i++ ){
			result += Math.abs( stringArray[i] - stringArray[i+1] );
}
	return result;
}
}
