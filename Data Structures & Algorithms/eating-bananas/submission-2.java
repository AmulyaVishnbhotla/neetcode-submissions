class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatBananas(mid, h, piles) == true) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean canEatBananas(int k, int h, int[] piles) {
        long res = 0;

        for (int pile : piles) {
            res += ((long) pile + k - 1) / k;
        }

        if(res > h){
            return false;
        }

        return res <= h;
    }
}
