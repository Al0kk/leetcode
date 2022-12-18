class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=0;
        int last=0;
        if(nums.length==0){
            return new int[] {-1,-1};
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                first=i;
                System.out.println(first);
                break ;
            }else{
                first=-1;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                last=j;
                System.out.println(last);
                break ;
            }else{
                last=-1;
            }
            
        
        
    }
    return new int[]{first,last};
}
}