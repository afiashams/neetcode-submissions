class Solution{
	public boolean isAnagram(String s, String t){
        if( s.length() != t.length() ){
            return false;
        }
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		// String sNew = String.valueOf(sArr);
		// String tNew = String.valueOf(tArr);

		// return sNew.equals(tNew);
        return Arrays.equals(sArr, tArr);

		


}
}
