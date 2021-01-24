//https://leetcode.com/problems/maximum-subarray/submissions/
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0, maxsum=nums[0];
        for(int i=0;i<nums.length-1;i++){
            sum=sum+nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
               if(sum>maxsum && sum>nums[i] && sum>nums[j]){
                   maxsum=sum;
               }
                else if(nums[i]>=sum && nums[i]>maxsum && nums[i]>nums[j]){
                    maxsum=nums[i];
                    
                }
                else if (nums[j]>=sum && nums[j]>maxsum && nums[j]>nums[i]){
                    maxsum=nums[j];
                }
            }
            sum=0;
        }
        return maxsum;
    }
}