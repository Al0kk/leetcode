class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else{
                digits[i]=0;
            }
          
}
if(digits[0]==0){
    int[] sum=new int[n+1];
    sum[0]=1;
    return sum;
}
return digits;
    }
}