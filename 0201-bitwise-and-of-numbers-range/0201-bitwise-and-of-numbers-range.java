class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        // Keep shifting the bits of left and right to the right until they become equal
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        // After the loop, left and right have the common prefix in their binary representation.
        // Shift back to the left to get the final result.
        return left << shift;
    }
}
