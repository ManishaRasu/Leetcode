class Solution {
    public int findNumbers(int[] nums) {
        
        int e=0;
        for(int i=0;i<nums.length;i++){
            int dig=nums[i];
            int c=0;
            if(dig==0){
                c=1;
            }else{
            while(dig!=0){
                c++;
                dig=dig/10;
                
            }
            }
            if(c%2==0){
                e++;
            }
        }
        return e;
    }
}