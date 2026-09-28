class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int tot=duration;
        for(int i=1;i<timeSeries.length;i++){
            int gap=timeSeries[i]-timeSeries[i-1];
            if(gap<duration){
                tot+=gap;

            }else{
                tot+=duration;
            }
        }
        return tot;
    }
}