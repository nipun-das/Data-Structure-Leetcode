/*
Problem 53.

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
*/

/*Answer : */



//refer this video : https://www.youtube.com/watch?v=HCL4_bOd3-4

//solved using Kadanes's algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; 
        int currSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            currSum = currSum + nums[i];
              
            if(maxSum < currSum){
                maxSum = currSum;
            } 
            
            if(currSum < 0){ // if currSum is negative then neglect that substring, start from next element onwards
                currSum = 0;
            }    
        }
        
        return maxSum;
    }
}
