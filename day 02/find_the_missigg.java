///
//Find Missing And Repeating 
class Solve {
    int[] findTwoElement(int arr[], int n) {
         
        int d = 0;
        int m = 0;
        for(int i = 0 ; i< n ; i++){
            int idx = Math.abs(arr[i]) -1 ;
             if(arr[idx] < 0 ) 
             d = idx +1 ; 
              else {
                  arr[idx] = -arr[idx];
              }
             
        }
        
       for(int ii = 0 ; ii< n ; ii++){
            if(arr[ii] > 0 ){
                m = ii+1;
                break ;
            }
        }
        
        
        int [] arr1 = {d , m} ;
        return arr1;
      
    }
    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int as = 0 ;
        int os = 0 ; 
         
        for(int i : nums){
            as = as + i ;
        }
        os = n*(n+1)/2;
        int dif = Math.abs(os - as);
        return dif ;
        
    }
            public int findDuplicate(int[] nums) {
                 if(nums.length == 0 ) return -1;
        for(int i = 0 ; i<nums.length ; i++){
            int idx = Math.abs(nums[i]) -1 ;
            if(nums[idx] < 0) return idx +1 ;
            nums[idx] = -nums[idx];
        }
      return -1;  

        
    }
}