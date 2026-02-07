class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> n1=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            n1.add(candyType[i]);
        }
        return Math.min(n1.size(),candyType.length/2);
    }
}