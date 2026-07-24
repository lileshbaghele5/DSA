class Solution {
    public int uniqueXorTriplets(int[] nums) {

        boolean[] present = new boolean[2048];

        for (int x : nums)
            present[x] = true;

        boolean[] two = new boolean[2048];

        for (int a = 0; a < 2048; a++) {
            if (!present[a]) continue;

            for (int b = 0; b < 2048; b++) {
                if (!present[b]) continue;

                two[a ^ b] = true;
            }
        }

        boolean[] ans = new boolean[2048];

        for (int x = 0; x < 2048; x++) {
            if (!two[x]) continue;

            for (int a = 0; a < 2048; a++) {
                if (!present[a]) continue;

                ans[x ^ a] = true;
            }
        }

        int count = 0;

        for (boolean b : ans)
            if (b) count++;

        return count;
    }
}