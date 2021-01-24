//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    var t=target;
    for(var i=0;i<numbers.length-1;i++){
        for(var j=i+1;j<numbers.length;j++){
            if(t-numbers[j]==numbers[i]){
                i=i+1;
                j=j+1
                return [i,j];
            }
        
        
    }
   
    }
     return [];
};