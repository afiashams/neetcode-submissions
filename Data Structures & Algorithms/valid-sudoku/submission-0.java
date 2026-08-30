class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> setValue = new HashSet<>();
        for( int i=0; i<9; i++ ){
            for( int j=0; j<9; j++ ){
                char val = board[i][j] ;
                if(val == '.'  ){
                    continue;
                }
                if( setValue.contains(board[i][j] + " in row "+i) ||
                setValue.contains(board[i][j] + " in col "+j) ||
                setValue.contains(board[i][j] + " in box "+(i/3)+"~"+(j/3))
                  ){
                    return false;
                }
                setValue.add(board[i][j] + " in row "+i);
                setValue.add(board[i][j] + " in col "+j) ;
                setValue.add(board[i][j] + " in box "+(i/3)+"~"+(j/3)) ;



            }


        }
        return true;

        
        
    }
}
