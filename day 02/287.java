//287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i-1])
//                 return nums[i];
//         }

//         return -1;
        
        if(nums.length == 0 ) return -1;
        for(int i = 0 ; i<nums.length ; i++){
            int idx = Math.abs(nums[i]) -1 ;
            if(nums[idx] < 0) return idx +1 ;
            nums[idx] = -nums[idx];
        }
      return -1;  
    }
}