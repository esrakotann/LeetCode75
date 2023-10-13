
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int pivot;
            if(height[i]<=height[j]){
                pivot=height[i]*(j-i);
                i++;
            }else{
                pivot=height[j]*(j-i);
                j--;
            }
            if(pivot>max){
                max=pivot;
            }
        }
        return max;
    }
}