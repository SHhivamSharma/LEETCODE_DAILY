// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
       // int val = nums[0];
       //  int count = 1;
       //  for(int i = 1 ; i< nums.length ; i++){
       //      if(nums[i] == val){
       //          count++;
       //      }
       //      else{
       //          if(count >0){
       //              // pairing the dis elements 
       //              count--;
       //          } else {
       //              // reset
       //              val = nums[i];
       //              count = 1;
       //          }
       //      }
       //  }
       //  return val ; 
        int count = 0 ;
        int candidate = 0 ;
        for(int num : nums){
            if(count == 0 ){
                candidate = num;
            } 
            if(num == candidate ) count += 1;
            else count -= 1;
        }
        return candidate ;
    }
}