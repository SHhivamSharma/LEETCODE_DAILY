// 867. Transpose Matrix
class Solution {
 
    public int[][] transpose(int[][] matrix) {
           int row = matrix.length;
        int col = matrix[0].length;
        int [][] res = new int[col][row];
        for(int r = 0 ; r<col ; r++){
            for(int c = 0 ; c < row ; c++){
             //   res[c][r] = matrix[r][c];
                 res[r][c] = matrix[c][r];
            }
        
       }
     return res;
 }
}
 