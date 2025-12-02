class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
        }
        int l=0;
        int r=s;
        for(int i=0;i<nums.length;i++){
            r=r-nums[i];
            if(l==r){
                return i;
            }
            else{
                l=l+nums[i];
            }
        }
        return -1;
    }
}