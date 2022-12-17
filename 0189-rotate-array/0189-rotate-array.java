class Solution {
    public void rotate(int[] nums, int k) {
        int len =nums.length; 
        k=k%len;
        reverse(0,len-k-1,nums);
        reverse(len-k,len-1,nums);
        reverse(0,len-1,nums);
        
    }
    private static void reverse(int s,int e,int[] nums){

        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}