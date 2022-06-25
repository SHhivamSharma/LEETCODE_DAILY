// 268. Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int as = 0 ;
        int os = 0 ; 
        // for(int i =0 ; i< n ; i++){
        //     as = nums[i] + as;
        // }
        for(int i : nums){
            as = as + i ;
        }
        os = n*(n+1)/2;
        
        return os - as;
        
    }
}