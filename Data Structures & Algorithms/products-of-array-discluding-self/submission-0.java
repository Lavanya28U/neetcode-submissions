class Solution {
    public int[] productExceptSelf(int[] nums) {
          int k=nums.length;
        int[] ans=new int[k];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int s=1;
        for(int n=k-1;n>=0;n--){
            ans[n]=ans[n]*s;
            s=s*nums[n];
        }
        return ans;
     
}  
}