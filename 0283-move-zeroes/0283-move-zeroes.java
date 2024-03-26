class Solution {
    public void moveZeroes(int[] nums) {
        int lastnumFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != lastnumFoundAt) {
                    int temp = nums[i];
                    nums[i] = nums[lastnumFoundAt];
                    nums[lastnumFoundAt] = temp;
                }
                lastnumFoundAt++;
            }
        }
    }
}
