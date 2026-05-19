class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
            int a=rob1(nums,0,n-2);
            int b=rob1(nums,1,n-1);
            return Math.max(a,b);
        }
    public int rob1(int[] nums,int start,int end){
            int p=0;
            int p1=0;
            for(int i=start;i<=end;i++){
                int pick=nums[i]+p1;
                int notpick=p;
                int c=Math.max(pick,notpick);
                p1=p;
                p=c;
            }
            return p;
        
    }
}