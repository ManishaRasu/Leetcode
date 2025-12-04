class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                m=nums[i];
            }
            else{
                m=m;
            }
        }
        int n1=m;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                n1=Math.min(n1,Math.abs(i-start));
        }
    } 
    return n1; 
    }
}