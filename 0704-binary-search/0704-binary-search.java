class Solution {
    public int search(int[] nums, int target) {
        int first=0;
        int last=nums.length-1;
        while(last>=first){
            int middle=(first+last)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]<target){
                first=middle+1;
            }
            if(nums[middle]>target){
                last=middle-1;
            }
        }
        return -1;
    }
}