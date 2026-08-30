class Solution {
    public int trap(int[] height) {
        int result = 0;

        //first using 2 array to store left max and right max
        /*int[] leftMaxArray = new int[height.length];
        int[] rightMaxArray = new int[height.length];

          leftMaxArray[0] = height[0];
          rightMaxArray[height.length-1] = height[height.length-1];

        for(int i=1; i<height.length; i++ ){
            leftMaxArray[i] = Math.max( leftMaxArray[i-1],height[i] );
        }
        for(int i=height.length-2; i>=0; i-- ){
            rightMaxArray[i] = Math.max( rightMaxArray[i+1],height[i] );
        }

        for(int i=0; i<height.length; i++ ){
            result = result + Math.min( leftMaxArray[i],rightMaxArray[i]) - height[i] ;
        }*/

        //using 2 pointer
        int lMax = height[0];
        int rMax = height[height.length-1];

        int start = 0;
        int end = height.length-1;

        while(start<end){
            lMax = Math.max( lMax,height[start] );
            rMax = Math.max( rMax,height[end] );
            if( lMax < rMax ){
                result = result + lMax -  height[start];
                start++;
            }
            else {
                result = result + rMax -  height[end];
                end--;
            }

            


        }


        return result;


        
    }
}
