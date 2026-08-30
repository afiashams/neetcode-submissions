class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int m = matrix.length;         
        int n = matrix[0].length;   

        //bruteforce
        // for( int i=0; i<m; i++ ){
        //     for( int j=0; j<n; j++ ){

        //         if( target == matrix[i][j] ){
        //             return true;
        //         }
            
        //     }
        // }

        //stair-case approach
        // int i=0;
        // int j=n-1;
        // while ( i>=0 && i<m && j >=0 && j< n ){
        //     if( matrix[i][j] ==  target ) {
        //         return true;
        //     }
        //     else  if( target > matrix[i][j] ) {
        //         i++;
        //     }
        //     else  if( target < matrix[i][j] ) {
        //         j--;
        //     }

        // }

        //find the row first and apply binary search
        
        int rowNumber = 0;
        for( int i=0; i<m; i++ ){
            if( target >= matrix[i][0] && target <= matrix[i][n-1] ){
                rowNumber = i;
                break;
            }
        }
        //we have to search in row- rowNumber we got from above for loop 
        int start = 0;
        int end = n-1; 
        int mid = 0;
        while (start <= end){
            mid = start + (end-start)/2;
            if( target == matrix[rowNumber][mid] ){
                return true;
            }
            else if( target < matrix[rowNumber][mid] ){
                end = mid-1;
            }
            else if( target > matrix[rowNumber][mid] ){
                start = mid+1;
            }
        }
        

        return false;
        
    }
}
