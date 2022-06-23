// 31. Next Permutation
class Solution {
    public void nextPermutation(int[] nums) {
        int a = nums.length-2 ;
        int b = 0 ; 
        while( a>= 0. && nums[a] >=nums[a+1]) a--;
        if( a >=0){ 
            b = nums.length-1;
            while(nums[a] >= nums[b]) 
                b--;
            swap(nums ,a , b );
            
        }
        rev ( nums , a+1 , nums.length-1 );
    }
    public static void swap (int[] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp ;
    }
    
  public static void rev (int[] nums , int a , int b){
      while(a < b){
          swap(nums , a, b);
          a++;
          b--;
      }
 
}}