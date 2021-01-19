//Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] b = new int[2];
       
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                 if(numbers[i]+numbers[j]==target){
                b[0]=i+1;
                b[1]=j+1;
                return b;
            }
            }
           
        }
        return b;
    }
}