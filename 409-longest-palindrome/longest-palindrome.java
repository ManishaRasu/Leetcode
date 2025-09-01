class Solution {
    public int longestPalindrome(String s) {
        int[] c=new int[200];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            c[c1]++;
        }
        int l=0;
        for(int i=0;i<c.length;i++){
            int freq=c[i];
            l=l+(freq/2)*2;
            
        
        if(l%2==0 && freq%2==1){
            l=l+1;
        }
        }
        return l;
    }
}