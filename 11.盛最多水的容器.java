class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0,maxArea=0;
        while(left<right){
        	int temp=(right-left)*Math.min(height[left],height[right]);
        	if (maxArea<temp) {
        		maxArea=temp;
        	}
        	if(height[left]<height[right]){
        		left++;
        	}else{
        		right--;
        	}
        }
        return maxArea;
    }
}