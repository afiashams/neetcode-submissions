class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }

        s = s.replaceAll("[^A-za0z0-9]","").toLowerCase();
        char[] charArr = s.toCharArray();
        int r = (s.length())-1;
        for( int i=0; i<(s.length())/2; i++){
            if( charArr[i] !=  charArr[r] ){
                return false;
            }
            r--;
        }
        return true;
            
        
    }
}
