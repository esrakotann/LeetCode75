
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int pivotIndex = -1;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                leftSum = leftSum + nums[i-1];
            }
            int rightSum = 0;
            if (i != nums.length - 1) {
                int b = i + 1;
                while (b < nums.length) {
                    rightSum = rightSum + nums[b];
                    b++;
                }
            }
            if (leftSum == rightSum) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }
}
/*
class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        // Initialize total sum of the given array...
        int totalSum = 0;
        // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
        int leftsum = 0;
        // Traverse the elements and add them to store the totalSum...
        for (int ele : nums)
            totalSum += ele;
        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            // sum to the left == leftsum.
            // sum to the right === totalSum - leftsum - nums[i]..
            // check if leftsum == totalSum - leftsum - nums[i]...
            if (leftsum * 2 == totalSum - nums[i])
                return i;       // Return the pivot index...
        return -1;      // If there is no index that satisfies the conditions in the problem statement...
    }
}
*/
