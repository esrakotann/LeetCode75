public class LongestSubarrayOfOnes {
    public int longestSubarray(int[] nums) {
        int i=0;
        int count=0;
        int k=1;
        int maxLength=Integer.MIN_VALUE;
        int zeroIndex=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                i++;
            }else{
                if(k==1){
                    k--;
                    zeroIndex=i+1;
                    i++;
                }else{
                    maxLength= Integer.max(count,maxLength);
                    count=i-zeroIndex;
                    zeroIndex=i+1;
                    i++;
                }
            }
        }
        if(count==nums.length){
            count=nums.length-1;
        }
        return maxLength= Integer.max(count,maxLength);

    }
}





