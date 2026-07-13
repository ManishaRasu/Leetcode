class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        int n=s.length();
        boolean[] arr=new boolean[n+1];
        arr[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(arr[j] && set.contains(s.substring(j,i))){
                    arr[i]=true;
                    break;
                }
            }
        }
        return arr[n];
    }
}