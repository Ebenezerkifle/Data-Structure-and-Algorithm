class Solution {
    public int maxArea(int[] height) {
    //using two ponters i and j.
    int i=0;
    int j=height.length-1;
    int maxArea=0;
        while(i!=j){
          int area=(j-i)*Math.min(height[i],height[j]); 
          if(area>maxArea){
              maxArea=area;
          }
          if(height[i]<height[j]){
              i++;
          }
          else{
              j--;
          }
        }
        return maxArea;
    }
}
