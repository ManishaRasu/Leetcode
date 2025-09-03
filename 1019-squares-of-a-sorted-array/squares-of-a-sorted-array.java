class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] c=new int[n];
    
       for(int i=0;i<n;i++){
        c[i]=nums[i]*nums[i];
       } 
         Arrays.sort(c);
       return c;
    }
}