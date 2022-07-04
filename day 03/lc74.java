// 74. Search a 2D Matrix

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 
    if(matrix.length == 0 ) return false ;
        int n = matrix.length;
        int m = matrix[0].length ;
        int lo = 0 ; //// it will start from 0 which is starting 
        int hi = (n*m) -1 ; /// sop taht har ek ko undex assing ho jay  which is also the total numner of elements 
        while (lo <= hi ){
            int mid = (lo + (hi-lo)/2);
            if(matrix[mid/m][mid%m] == target)
                return true ;
            if(matrix[mid/m][mid%m] < target)
              lo= mid +1 ;
            else  hi = mid-1;
        }
      return false ;  
    }
}
/// sol 2 pep coding 
/* class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int rowindx = findRowIndx(matrix,target);
        if(rowindx == -1 ) return false ;
        int colidx = findinrow(matrix , target , rowindx );
        return colidx != -1;
        
    }
    
     public static int findRowIndx (int[][] matrix , int target ){
         int idx = -1;
         int lo = 0;
         int hi = matrix.length - 1 ;
         while (lo <= hi ){
            int mid = lo +(hi - lo) /2;
            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1]){
                idx = mid;
                break ;
            }  else if(matrix[mid][0] > target ){
                hi = mid-1;
            } else{
                lo = mid+1;
            }
            
            
         }
         return idx;
     }
     
     public static int findinrow (int[][] matrix , int target , int row ){
         int idx = -1;
         int lo = 0 ;
         int hi = matrix[0].length-1;
         while (lo <= hi) {
             int mid = lo +(hi - lo) /2;
             if(matrix[row][mid] == target){
                 idx = mid ;
                 break ;
             } else if (matrix [row][mid] < target ){
                 lo = mid+1;
             } else {
                 hi = mid - 1 ;
             }
         }
         return idx;
    
    
     }
    
} */
 