class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for( int n : nums){
            set.add(n);
        }
        int maxLength = 0;
        int currentLength = 0;
        int elementToCheck;
        for( int n : nums ){
            if(!set.contains(n-1)){
                elementToCheck = n+1;
                currentLength = 1;

                while(set.contains(elementToCheck)){
                    elementToCheck++;
                    currentLength++;
                

                }
                maxLength = Math.max(maxLength,currentLength);

            }
        }
        return maxLength;
    }
}
