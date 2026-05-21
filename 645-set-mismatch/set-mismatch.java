class Solution {
    public int[] findErrorNums(int[] nums) {
       int n=nums.length;
       int dup=0;
       int miss=0; 
       int[] arr= new int[n+1];
       for(int i=0;i<n;i++){
        arr[nums[i]]++;
       }
       for(int i=1;i<=n;i++){
        if(arr[i]==2)
        dup=i;
        if(arr[i]==0)
        miss=i;
       }
       return new int[]{dup,miss};
    }
}