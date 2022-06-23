import java.util.Scanner;
// gg
 // 73. Set Matrix Zeroes
 //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

//You must do it in place.
 class Solution {
     // pepcodig 
    public void setZeroes(int[][] matrix) {
        boolean row = false , col = false ;
        
          int n = matrix.length;
        int m = matrix[0].length;
         for(int i = 0 ; i < n ; i++) if( matrix[i][0] == 0 ) col = true;
        
        
       for(int i = 0 ; i < m ; i++) if( matrix[0][i] == 0 ) row = true;

        /// filling i array 
        for (int i = 1; i < n; i++) {
    for (int j = 1; j < m; j++) { 
        
        if(matrix[i][j] == 0 ){
            matrix[i][0] = 0;
            matrix[0][j] =0 ;
        }
    }}
       /// converting the array wth of the dummay aray with 0  row 0 ho jay ge col ko dekh ke... 0 se nhia 1 swe satrt ho ge y 
        for(int i = 1 ; i< n ;i++){
            if(matrix[i][0] == 0){
                for(int  j = 1 ; j < m ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
         //// col 0 ho jayga row ko dekh ke 0 se nahi 1 se start ho ge y 
        for(int i = 1 ; i < m ;i++){
            if(matrix[0][i] == 0){
                for(int  j = 1 ; j < n ; j++){
                    matrix[j][i] = 0;
                }
            }
        } 
        
        
        /// if row m 0 hua to puro row 0 kr do
        if(row){
            for ( int j = 0 ; j < m ; j++)
            matrix[0][j] = 0;
        }
        
        if(col){
            for (int j = 0 ; j < n ; j++)
            matrix[j][0] = 0;
        }
         
    }
 }

//correct code from comments
//     public void setZeroes(int[][] matrix) {
//         boolean isFirstRowZero = false;
//         boolean isFirstColZero = false;
    
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 0) {
//                     if (i == 0 && j == 0) {
//                         isFirstRowZero = true;
//                         isFirstColZero = true;
//                     } else if (i == 0) {
//                         isFirstRowZero = true;
//                     } else if (j == 0) {
//                         isFirstColZero = true;
//                     } else {
//                         matrix[i][0] = 0;
//                         matrix[0][j] = 0;
//                     }                
//                 }
//             }
//         }
        
//         for (int i = 1; i < matrix.length; i++) {
//             if (matrix[i][0] == 0) {
//                 for (int j = 1; j < matrix[0].length; j++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         for (int j = 1; j < matrix[0].length; j++) {
//             if (matrix[0][j] == 0) {
//                 for (int i = 1; i < matrix.length; i++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
        
//         if (isFirstRowZero) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 matrix[0][j] = 0;
//             }
//         }
//         if (isFirstColZero) {
//             for (int i = 0; i < matrix.length; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     } 
 

//     // Iterate over the array once again and using the rows and cols sets, update the elements.
//     for (int i = 0; i < R; i++) {
//       for (int j = 0; j < C; j++) {
//         if (rows.contains(i) || cols.contains(j)) {
//           matrix[i][j] = 0;
//         }
//       }
//     }
//   }
  //// striver ka code 
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int coli = 1;
//         int ro = 1;
//         int row = matrix.length;
//         int col = matrix[0].length;
        
//         //to set the dummy matrix which is the first row nad col
//         for(int i = 0 ; i < row ;i++){
//             if(matrix[i][0] == 0) coli = 0 ;
//             for(int j = 0 ; j< col ; j++){
//                 if(matrix[0][j] == 0) row = 0 ;
//                 if(matrix[i][j] == 0 ){
//                     matrix[i][0] = 0 ;
//                     matrix[0][j] = 0;
//                 }
//             }
//         }
//          //// traversal from back , replacing numbers with zero 
//         for(int i = row - 1 ; i>= 0 ; i --  ){
//             for(int j = col -1 ; j >= 0 ; j--){
//                 if(matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j]= 0;
               
//                             if(row == 0) matrix[0][j] = 0;
// }
//             }
//             if(coli == 0) matrix[i][0] = 0;
//         }
            
// }
// }