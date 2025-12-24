


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        int len = flowerbed.length;
        if (n==0){
            return true;
        }

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {

                boolean l = (i == 0 || flowerbed[i - 1] == 0);
                boolean r = (i == len - 1 || flowerbed[i + 1] == 0);

                if (l && r) {
                    c++;
                    i++;

                    if (c >= n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
