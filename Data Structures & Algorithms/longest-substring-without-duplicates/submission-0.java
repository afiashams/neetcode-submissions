class Solution{
	public int lengthOfLongestSubstring( String s ){

		int result = 0;
		HashMap<Character,Integer> characterCountMap = new HashMap<>();
		int l=0;
		int r=0;
		for( r=0; r < s.length() ; r++ ){	
            if( characterCountMap.containsKey(s.charAt(r)) ){
                l = Math.max( l, characterCountMap.getOrDefault(s.charAt(r),0)+1); 
            }
            characterCountMap.put( s.charAt(r),r);
            result  = Math.max( result, r-l+1 );		
        }
	    return result;
    }
}
