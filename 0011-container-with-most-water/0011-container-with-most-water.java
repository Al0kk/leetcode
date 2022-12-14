class Solution {
    public int maxArea(int[] height) {
        int sum=0;
        int first=0;
        int last=height.length-1;

        while(first<last){
            if(height[first]<height[last]){
                sum=Math.max(sum,height[first]*(last-first));
                first++;
            }else{
                sum=Math.max(sum,height[last]*(last-first));
                last--;
            }
        }
        return sum;

        
    }
}