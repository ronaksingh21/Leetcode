class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            y[i] = nums[i + n];
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            nums[index++] = x[i];
            nums[index++] = y[i];
        }

        return nums;
    }
}
