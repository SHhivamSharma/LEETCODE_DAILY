// 53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int csum = 0;
       // int osum = Integer .MIN_VALUE;
        int osum = nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            if(csum < 0 ){
                csum = nums[i];
            } else {
                csum = csum + nums[i]; 
            }
            // osum = Math.max(osum , csum );
            if(csum>osum) 
                osum =csum;
        }
       return osum; 
    }
}