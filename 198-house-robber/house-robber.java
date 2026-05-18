class Solution {
    public int rob(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            int curr=Math.max(sum,nums[i]+sum1);
            sum1=sum;
            sum=curr;
        }
        return sum;
    }
}